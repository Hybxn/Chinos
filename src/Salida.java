public class Salida {

    public static void bienvenida(Jugador[] jugadores) {
        System.out.println("Bienvenidos al juego de los chinos!!!!!!");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Nuestros jugadores son: ");
        mostrarJugadores(jugadores);
    }

    public static void mostrarJugadores(Jugador[] jugadores) {
        for (int i = 0; i < jugadores.length; i++) {
            System.out.printf
                    ("Jugador Nº%d  -> %s, puntuacion: %d\n", i,
                            jugadores[i].getAlias(), jugadores[i].getPuntos());
        }
    }

    public static void instruccionIncial() {
        System.out.println("Que comience la partida!");
        System.out.println("Cada jugador debe elegir cuantos chinos poner");
        System.out.println("RECUERDA!, solo puedes elegir entre 0 y 3");
    }

    public static void mostrarApuestas(Jugador[] jugadores) {
        for (Jugador jugador : jugadores) {
            System.out.printf("%s ha apostado a que hay %d chinos en total.\n", jugador.getAlias(), jugador.getApuesta());
        }
        System.out.printf("En total hay %d chinos\n", Principal.total);
    }
}
