public class Jugador {

    //Atributos
    private String alias;
    private int numero;
    private int apuesta;
    private int puntos;

    //Constructores
    public Jugador() { //Constructor sin parametros de entrada.
        setAlias("Ivan");
        setNumero(0);
        setApuesta(0);
        setPuntos(0);
    }

    public Jugador(String alias) { //Constructor con un alias como parametros de entrada.
        setAlias(alias);
        setNumero(0);
        setApuesta(0);
        setPuntos(0);
    }

    //Getter & Setter de alias
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        assert alias != null && !alias.isBlank() && !alias.isEmpty() :
                String.format("Alias introducido invalido (%s) no debe ser null, ni estar vacio, ni ser espacios en blanco", alias);
        this.alias = alias;
    }

    //Getter & Setter de numero
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        assert numero >= 0 && numero <= 3 :
                String.format("El numero deben ser >= 0 y <= 3 (Introducido: %d)", numero);
        this.numero = numero;
    }

    //Getter & Setter de apuesta
    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        assert apuesta >= 0 :
                String.format("La apuesta debe ser >= 0 (Introducido: %d)", apuesta);
        this.apuesta = apuesta;
    }

    //Getter & Setter de puntos
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        assert puntos >= 0 :
                String.format("Alias: %s, Apuesta: %d, Numero: %d, Puntos: %d",
                        getAlias(), getApuesta(), getNumero(), getPuntos());
        this.puntos = puntos;
    }

    //Funcionalidades de la clase Jugador
    public void incPuntos() {//Metodo que incrementa los puntos del jugador
        setPuntos(getPuntos() + 1);
    }

    public void elegirChinos() {//Metodo que genera un numero al azar simulando los chinos que elige el jugador
        setNumero((int) (Math.random() * 4));
    }
}
