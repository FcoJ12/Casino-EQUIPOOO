package Juegos.Tragamonedas;

import Juegos.Tragamonedas.Simbolos.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Murat
 */
public class Tragamonedas {
    
    private static ArrayList<Simbolo> carrete;
    
    public Tragamonedas(){
        carrete = new ArrayList<>();
        llenar();
    }
    
    private void llenar(){
        
        Manzana manzana = new Manzana();
        Limon limon = new Limon();
        Corazon corazon = new Corazon();
        Cereza cereza = new Cereza();
        Bar bar1 = new Bar(1);
        Bar bar2 = new Bar(2);
        Bar bar3 = new Bar(3);
        Campana campana = new Campana();
        Siete sieteRojo = new Siete("rojo");
        Siete sieteVerde = new Siete("verde");
        Uva uva = new Uva();
        Sandia sandia = new Sandia();

        int i;
        
        for(i=0; i<25; i++)
            carrete.add(manzana);
        
        for(i=0; i<20; i++)
            carrete.add(limon);
        
        for(i=0; i<10; i++){
            carrete.add(sandia);
            carrete.add(uva);
        }
        
        for(i=0; i<13; i++)
            carrete.add(corazon);
        
        for(i=0; i<9; i++)
            carrete.add(campana);
        
        for(i=0; i<6; i++)
            carrete.add(cereza);
        
        for(i=0; i<2; i++){
            carrete.add(bar1);
            carrete.add(bar2);
        }
        carrete.add(bar3);
        
        carrete.add(sieteRojo);
        carrete.add(sieteVerde);
    }
    
    public static int menuTragamonedas(){
        int opt=0;
        boolean excepcion = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Costo por tirada: $3");
        do{
            excepcion = false;
            try{
            System.out.println("\t1) Jugar un simple");
            System.out.println("\t2) Jugar un doble");
            System.out.println("\t3) Jugar un triple");
            System.out.println("\t4) Tabla de premios");
            System.out.println("\t5) Salir");
            System.out.print("Ingrese una opcion: ");
            opt = scanner.nextInt();
            } catch(InputMismatchException e){
                scanner.nextLine();
                System.out.println("Ingrese un numero");
                excepcion = true;
                
            }
            if(opt<0 || opt>5){
                System.out.println("Ingrese una opcion valida");
                excepcion = true;
            }
        }while(excepcion == true);
        return opt;
    }
    
    public Tirada Jugar(int mult){
        ArrayList<Simbolo> tirada = new ArrayList<>();
        int cCer=0;
        int cBar=0;
        int c7=0;
        
        for(int i=0; i<3; i++){
            Simbolo sim = girar();
            if(sim instanceof Cereza)
                cCer++;
            else if(sim instanceof Bar)
                cBar++;
            else if(sim instanceof Siete)
                c7++;
            tirada.add(sim);
        }
        
        mostrarTirada(tirada);
        
        int premio = comprobarPremio(tirada, cCer, cBar, c7);
        return new Tirada(tirada, premio);
    }
    
    public Simbolo girar(){
        Random random = new Random();  
        return carrete.get(random.nextInt(100));
    }
    
    public int comprobarPremio(ArrayList<Simbolo> tirada, int cCer, int cBar, int c7){
        if(c7 == 3){
            Siete s1 = (Siete) tirada.get(0);
            Siete s2 = (Siete) tirada.get(1);
            Siete s3 = (Siete) tirada.get(2);
            if(s1.getColor().equals(s2.getColor()) && s1.getColor().equals(s3.getColor()))
                return s1.getValor()*3;
            else{
                return 100;
            }    
        } else if (cCer != 0 ){
            switch (cCer) {
                case 3 -> {
                    return tirada.get(0).getValor()*3;
                }
                case 2 -> {
                    int i = 0;
                    while(!(tirada.get(i) instanceof Cereza)){
                        i++;
                    }
                    return tirada.get(i).getValor()*2;
                }
                case 1 -> {
                    int i = 0;
                    while(!(tirada.get(i) instanceof Cereza)){
                        i++;
                    }
                    switch(i){
                        case 0->{
                            if(tirada.get(1).getClass() == tirada.get(2).getClass())
                                return tirada.get(0).getValor();
                        }
                        case 1->{
                            if(tirada.get(0).getClass() == tirada.get(2).getClass())
                                return tirada.get(1).getValor();
                        }
                        case 2->{
                            if(tirada.get(1).getClass() == tirada.get(0).getClass())
                                return tirada.get(2).getValor();
                        }
                    }
                }
            }
        } else if(cBar==3){
            ArrayList <Bar> bars = new ArrayList<>();
            for(int i=0; i<3; i++)
                bars.add((Bar) tirada.get(i));
            
            int bars1=0;
            int bars2=0;
            int bars3=0;
            for(int i=0; i<3; i++){
                switch (bars.get(i).getBars()) {
                    case 1 -> bars1++;
                    case 2 -> bars2++;
                    case 3 -> bars3++;
                }
            }
            
            if(bars3==3)
                return tirada.get(0).getValor()*4;
            else if(bars2==3)
                return tirada.get(0).getValor()*3;
            else if(bars1==3)
                return tirada.get(0).getValor()*2;
            else
                return tirada.get(0).getValor();
        } else if(tirada.get(0).getClass() == tirada.get(1).getClass() && 
                    tirada.get(0).getClass() == tirada.get(2).getClass())
                return tirada.get(0).getValor();
        
        return 0;
    }
    
    public void mostrarTirada(ArrayList<Simbolo> tirada){
        for(int i=0 ; i<3; i++){
            System.out.print("Tirada " + (i+1) + " : ");
            Simbolo sim = tirada.get(i);
            if(sim instanceof Bar){
                Bar bar = (Bar) tirada.get(i);
                switch(bar.getBars()){
                    case 1->{
                        System.out.println("Bar Simple");
                    }
                    case 2->{
                        System.out.println("Bar Doble");
                    }
                    case 3->{
                        System.out.println("Bar Triple");
                    }
                }
            } else if(sim instanceof Siete){
                Siete siete = (Siete) tirada.get(i);
                if(siete.getColor().equals("rojo"))
                    System.out.println("7 rojo");
                else
                    System.out.println("7 verde");
            } else
                System.out.println(sim.getClass().getSimpleName());
        }
    }
    
    public static void verPremios(){
        System.out.println("Premios: ");
        System.out.println("\tCombinacion\t\t Simple \t Doble \t\t Triple");
        System.out.println("\t7s rojos\t\t 300 \t\t 900 \t\t 1500");
        System.out.println("\t7s verdes\t\t 240 \t\t 720 \t\t 1200");
        System.out.println("\t7s combinados\t\t 100 \t\t 300 \t\t 500");
        System.out.println("\t3 Triple Bar\t\t 120 \t\t 360 \t\t 600");
        System.out.println("\t3 Doble Bar\t\t 90 \t\t 270 \t\t 450");
        System.out.println("\t3 Simple Bar\t\t 60 \t\t 180 \t\t 300");
        System.out.println("\t3 Bar combinados\t 30 \t\t 90 \t\t 120");
        System.out.println("\t3 Cerezas\t\t 111 \t\t 333 \t\t 555");
        System.out.println("\t2 Cerezas\t\t 74 \t\t 222 \t\t 370");
        System.out.println("\t1 Cereza 2 otro\t\t 37 \t\t 111 \t\t 185");
        System.out.println("\t3 Campanas\t\t 35 \t\t 105 \t\t 175");
        System.out.println("\t3 Sandias\t\t 30 \t\t 90 \t\t 150");
        System.out.println("\t3 Uvas\t\t\t 30 \t\t 90 \t\t 150");
        System.out.println("\t3 Limones\t\t 20 \t\t 60 \t\t 80");
        System.out.println("\t3 Manzanas\t\t 15 \t\t 45 \t\t 75");
    }
    
    public static void main(String[] args) {
        Tragamonedas maquina = new Tragamonedas();
        int saldo=1000;
        int ganancia=0;
        int perdida=0;
        int opt=0;
        int premio=0;
        int tiradas=0;
        System.out.println("Bienvenido");
        do{
            System.out.println("Tu saldo actual es: " + saldo);
            System.out.println("Tiradas: " + tiradas);
            System.out.println("Ganancias: " + ganancia);
            System.out.println("Perdidas: " + perdida);
            opt=menuTragamonedas();
            switch(opt){
                case 1->{
                    if(saldo>=3){
                        saldo-=3;
                        perdida+=3;
                        tiradas++;
                        //premio = maquina.Jugar(1);
                        if(premio>0)
                            System.out.println("Felicidades tu premio es de: "+ premio);
                        else
                            System.out.println("Suerte para la proxima, seguro ganas!");
                    } else 
                        System.out.println("Saldo insuficiente");
                    
                }
                case 2->{
                    if(saldo>=6){
                        saldo-=6;
                        perdida+=6;
                        tiradas++;
                        //premio = maquina.Jugar(3);
                        if(premio>0)
                            System.out.println("Felicidades tu premio es de: "+ premio);
                        else
                            System.out.println("Suerte para la proxima, seguro ganas!");
                    } else 
                        System.out.println("Saldo insuficiente");
                    
                }
                case 3->{
                    if(saldo>=9){
                        saldo-=9;
                        perdida+=9;
                        tiradas++;
                        //premio = maquina.Jugar(5);
                        if(premio>0)
                            System.out.println("Felicidades tu premio es de: "+ premio);
                        else
                            System.out.println("Suerte para la proxima, seguro ganas!");
                    } else 
                        System.out.println("Saldo insuficiente");
                }
                case 4->{
                    verPremios();
                }
                case 5->{
                    System.out.println("Nos vemos de nuevo cuando quieras ser millonario");
                }
            }
            if(premio!=0){
                saldo+=premio;
                ganancia+=premio;
                //Aqui tiene que ir la actualizacion de saldo dinamica en archivos para el usuario
            }
        }while(opt!=5);
    }
    
}

class Tirada {
    int premio;
    ArrayList<Simbolo> tirada;
    
    public Tirada(ArrayList<Simbolo> tirada, int premio){
        this.tirada=tirada;
        this.premio = premio;
    }
    
    public ArrayList<Simbolo> getTirada(){
        return tirada;
    }
    
    public int getPremio(){
        return premio;
    }
}