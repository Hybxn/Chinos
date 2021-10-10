import java.util.Scanner;

public class Principal {

    protected static int total = 0; //Variable que contara el total de chinos de todos los juagdores
    private static Scanner sc = new Scanner(System.in); //Instanciamos un scanner para leer los mensajes de los usuarios

    public static void main(String[] args) {

        Jugador[] jugadores = new Jugador[3];
        Utilidad.cargarJugadores(jugadores);

        Salida.bienvenida(jugadores);
        Salida.instruccionIncial();

        Utilidad.cargarChinos(jugadores);
        Utilidad.cargarApuestas(jugadores, sc);
        Utilidad.calcularTotal(jugadores);

        Salida.mostrarApuestas(jugadores);

        Utilidad.calcularPuntuacion(jugadores);

        Salida.mostrarJugadores(jugadores);
    }
}
