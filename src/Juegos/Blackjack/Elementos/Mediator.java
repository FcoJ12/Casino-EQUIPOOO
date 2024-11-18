/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos.Blackjack.Elementos;

import Juegos.Blackjack.BlackJackPrincipal;
import Juegos.Blackjack.Cartas.Carta;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author javi
 */
public class Mediator implements AbstractMediator{
    
    private Cupier cupier;
    private LinkedList<Jugador> jugadores;
    private int turnoJugador;
    private MesaBlackJack mesaBlackJack;
    
    public Mediator(double apuesta, double dinero){
        this.cupier = new Cupier(this);
        this.jugadores = new LinkedList<>();
        this.mesaBlackJack = new MesaBlackJack(this);
        
        turnoJugador = 0;
        
        Jugador jugador = new Jugador (dinero,apuesta,this); //primeros dos
        jugadores.add(jugador);
        
        mesaBlackJack.setTextLabelDinero(dinero-apuesta);
        mesaBlackJack.setTextLabelApuesta(apuesta);
        
        
        cupier.repartirCartasInicio();
    }
   
    @Override
    public void notify(Object sender, String event){
        if (sender instanceof Cupier && event.equals("Repartir Cartas Inicio")){   //Cupier reparte todas las cartas
            for (int i = 0; i < jugadores.size(); i++) {
                for (int j = 0; j < 2; j++) {
                    jugadores.get(i).addCarta(cupier.repartirCarta());
                }
            }

        } else if (sender instanceof Jugador && event.equals("Carta Agregada")){   //Jugador agrega una carta.
            Jugador player = (Jugador) sender;
            
            Carta carta = player.getLastCart();
            
            String pathImage = calcularPath(carta);
                    
            switch (player.getCartas().size()){
                case 1 -> {
                    mesaBlackJack.setImagePlayer1(pathImage);
                }
                case 2 -> {
                    mesaBlackJack.setImagePlayer2(pathImage);
                }
                case 3 -> {
                    mesaBlackJack.setImagePlayer3(pathImage);
                }
                case 4 -> {
                    mesaBlackJack.setImagePlayer4(pathImage);
                }
                case 5 -> {
                    mesaBlackJack.setImagePlayer5(pathImage);
                }
                case 6 -> {
                    mesaBlackJack.setImagePlayer6(pathImage);
                }
            }
            
            int suma = player.sumarCartas();
            mesaBlackJack.setSuamDeCartasJugador(suma);
            
            if (suma < 21){
                
            } else if (suma == 21){
                ///Ganó
            } else if (suma > 21){
                mesaBlackJack.setButtonPararState(false);
                mesaBlackJack.setButtonPedirState(false);
                
                player.setCheckParar(true);
            }
                     
        } else if (sender instanceof MesaBlackJack && event.equals("Pedir Carta")){   // Jugador Pide Carta, desde BlackJack
            jugadores.get(turnoJugador).addCarta(cupier.repartirCarta());
            
        } else if (sender instanceof Cupier && event.equals("Tomar Carta")){
            Cupier cupier = (Cupier) sender;
            Carta carta = cupier.getLast();
            String pathImage = calcularPath(carta);
                    
            switch (cupier.getCartasDelCupier().size()){
                case 1 -> {
                    mesaBlackJack.setCupierCard1("");
                }
                case 2 -> {
                    mesaBlackJack.setCupierCard2(pathImage);
                }
                case 3 -> {
                    mesaBlackJack.setCupierCard3(pathImage);
                }
                case 4 -> {
                    //mesaBlackJack.setImagePlayer3(pathImage);
                }
                case 5 -> {
                    //mesaBlackJack.setImagePlayer3(pathImage);
                }
            }
            
            if (cupier.getCartasDelCupier().size() > 2){
                int suma = cupier.sumarCartas();
                mesaBlackJack.setSuamDeCartasJugador1(suma);

                int restante = 21 - suma;

                if (suma <= 11){
                    cupier.tomarCarta();
                } else {                
                    double probabilidad = probabilidadDeObtenerUnaCartaMenorA(restante);

                    if (probabilidad <= 0.5){
                        BlackJackPrincipal.BlackJack.setVisible(true);
                        //BlackJackPrincipal.BlackJack.setDineroDelUsuario();
                        BlackJackPrincipal.BlackJack.actualizarDinero();
                        MesaBlackJack.MBJack.setVisible(false);
                        ////// ACABAAAAAAAAAAAAAARR
                    } else {
                        cupier.tomarCarta();
                    }
                }
            }            
        } else if (sender instanceof Jugador  && event.equals("Jugador Paro")){  ///El usuario ya paró de jugar es turno de cupier.
            Carta carta = cupier.getFirst();
            String imagePath = calcularPath(carta);
            mesaBlackJack.setCupierCard1(imagePath);
            
            int suma = cupier.sumarCartas();
            mesaBlackJack.setSuamDeCartasJugador1(suma);
            
            int restante = 21 - suma;
            
            if (suma <= 11){
                cupier.tomarCarta();
            } else {                
                double probabilidad = probabilidadDeObtenerUnaCartaMenorA(restante);
                
                if (probabilidad <= 0.5){
                    BlackJackPrincipal.BlackJack.setVisible(true);
                    //BlackJackPrincipal.BlackJack.setDineroDelUsuario();
                    BlackJackPrincipal.BlackJack.actualizarDinero();
                    MesaBlackJack.MBJack.setVisible(false);
                } else {
                    cupier.tomarCarta();
                }
            }
            
        } else if (sender instanceof MesaBlackJack && event.equals("Solicitud Parar")){
            jugadores.get(turnoJugador).setCheckParar(true);
            
        } 
    }
    
    public List<Integer> contarCartas() {
        List<Integer> numeroDeCartas = new LinkedList<>();

        for (int i = 0; i < 13; i++) {
            numeroDeCartas.add(24); // Inicializar todas las cartas en 24
        }

        // Reducir las cartas en base a las cartas de los jugadores
        for (int i = 0; i < jugadores.size(); i++) {
            for (int j = 0; j < jugadores.get(i).getCartas().size(); j++) {
                Carta carta = jugadores.get(i).getCartas().get(j);
                int index = carta.getValor()-1;
                numeroDeCartas.set(index, numeroDeCartas.get(index) - 1);
            }
        }

        // Reducir las cartas en base a las cartas del cupier
        for (int i = 0; i < cupier.getCartasDelCupier().size(); i++) {
            Carta carta = cupier.getCartasDelCupier().get(i);
            int index = carta.getValor() - 1;
            numeroDeCartas.set(index, numeroDeCartas.get(index) - 1);
        }

        return numeroDeCartas;
    }
    
    public double probabilidadDeObtenerUnaCartaMenorA(int numero) {
        List<Integer> numeroDeCartas = contarCartas();
        int suma = 0;
        int totalCartasRestantes = 0;

        // Calcular el número total de cartas menores a 'numero'
        for (int i = 0; i < numero; i++) {
            suma += numeroDeCartas.get(i);
        }

        // Calcular el número total de cartas restantes
        for (int cartas : numeroDeCartas) {
            totalCartasRestantes += cartas;
        }

        // Calcular la probabilidad
        double probabilidad = (double) suma / totalCartasRestantes;

        System.out.println("Suma de cartas menores a " + numero + ": " + suma);
        System.out.println("Total de cartas restantes: " + totalCartasRestantes);
        System.out.println("Probabilidad: " + probabilidad);

        return probabilidad;
    }
    
    public String calcularPath (Carta carta){
        String pathImage = "src/Juegos/Blackjack/images/";
            
            switch (carta.getTipoDeCarta()){
                case 1 -> {
                    pathImage += "Corazones/";
                }
                case 2 -> {
                    pathImage += "Diamantes/";
                }
                case 3 -> {
                    pathImage += "Treboles/";
                }
                case 4 -> {
                    pathImage += "Picas/";
                }
                    
            }
            
            switch (carta.getValor()){
                case 1 -> {
                    pathImage += "1.png";
                }
                case 2 -> {
                    pathImage += "2.png";
                }
                case 3 -> {
                    pathImage += "3.png";
                }
                case 4 -> {
                    pathImage += "4.png";
                }
                case 5 -> {
                    pathImage += "5.png";
                }
                case 6 -> {
                    pathImage += "6.png";
                }
                case 7 -> {
                    pathImage += "7.png";
                }
                case 8 -> {
                    pathImage += "8.png";
                }
                case 9 -> {
                    pathImage += "9.png";
                }
                case 10 -> {
                    pathImage += "10.png";
                }
                case 11 -> {
                    pathImage += "11.png";
                }
                case 12 -> {
                    pathImage += "12.png";
                }
                case 13 -> {
                    pathImage += "13.png";
                }
            }
        return pathImage;
    }
    
    public void setVisibleMesaBlackJack(){
        this.mesaBlackJack.setVisible(true);
    }
    
    public void setDineroDisponible(int dinero){
        this.mesaBlackJack.dineroDisponible = dinero;
        
    }
    
    void verificarGanador (){
        int jugador = mesaBlackJack.getSuamDeCartasJugador();
        int cupier = mesaBlackJack.getSuamDeCartasJugador1();
        
        if (jugador > 21 && cupier > 21){
            if (jugador < cupier){
                
            } else {
                
            }
        } else if (jugador > 21 && cupier < 21){
           
        } else if (jugador < 21 && cupier > 21){
            
        } else if (jugador < 21 && cupier > 21){
            if (jugador > cupier){
                
            } else {
               
            }
        } else {
            
        }
    }
    
}
