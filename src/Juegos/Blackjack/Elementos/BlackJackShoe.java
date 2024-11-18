package Juegos.Blackjack.Elementos;

import Juegos.Blackjack.Cartas.Carta;
import Juegos.Blackjack.Cartas.Mazo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class BlackJackShoe {

    private static Random rd = new Random();
    private int numeroDeMazos;
    private LinkedList<Carta> cartasDeShoeBarajeadas;

    public BlackJackShoe(int numeroDeMazos) {
        if (numeroDeMazos <= 0) {
            throw new IllegalArgumentException("El número de mazos debe ser mayor a 0.");
        }
        this.numeroDeMazos = numeroDeMazos;
        this.cartasDeShoeBarajeadas = new LinkedList<>();
        barajearCartas();
        
    }

    public BlackJackShoe() {
        this(6); // Por defecto, utiliza 6 mazos
    }

    private void barajearCartas() {
        LinkedList<Carta> todasLasCartas = new LinkedList<>();

        // Generar y mezclar cartas de cada mazo
        for (int i = 0; i < numeroDeMazos; i++) {
            Mazo mazo = new Mazo();
            mazo.obtenerMazoBarajeado();
            todasLasCartas.addAll(mazo.getBarajaCompleta());
        }

        // Barajar todas las cartas juntas
        Collections.shuffle(todasLasCartas, rd);
        this.cartasDeShoeBarajeadas = todasLasCartas;
    }

    public LinkedList<Carta> getCartasDeShoeBarajeadas() {
        return cartasDeShoeBarajeadas;
    }

    public Carta desencolarCarta() {
        if (cartasDeShoeBarajeadas.isEmpty()) {
            throw new IllegalStateException("El shoe está vacío. No hay más cartas disponibles.");
        }
        return cartasDeShoeBarajeadas.pollFirst();
    }
}
