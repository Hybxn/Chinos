import java.util.ArrayList;
import java.util.Scanner;

public class Utilidad {

    private static final String[] nombresFinal = new String[]{
            "Raul", "Marta", "Sergio", "Iker", "Miguel", "Miriam", "Lydia", "Javier", "Elena", "Andrea", "Rodrigo", "Gabriel", "Diego", "Pedro", "Alvaro"
    };

    public static void cargarJugadores(Jugador[] jugadores) {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(nombresFinal[(int) (Math.random() * nombresFinal.length)]);
        }
    }

    public static void cargarChinos(Jugador[] jugadores) {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].elegirChinos();
        }
    }

    public static void cargarApuestas(Jugador[] jugadores, Scanner scanner) {
        for (Jugador jugador : jugadores) {
            System.out.printf("%s es tu turno! Cuantos chinos crees que hay en total?", jugador.getAlias());
            jugador.setApuesta(scanner.nextInt());
        }
    }

    public static void calcularTotal(Jugador[] jugadores) {
        for (Jugador jugador : jugadores) {
            Principal.total += jugador.getNumero();
        }
    }

    public static void calcularPuntuacion(Jugador[] jugadores) {
        for (Jugador jugador : jugadores) {
            if (jugador.getApuesta() == Principal.total)
                jugador.incPuntos();
        }
    }
}
