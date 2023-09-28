/**
 * Primera clase que es ejecutada
 */
public class Principal {

    /**
     * Primer método que se ejecuta en mi aplicación
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta("Trek", 2021, 21);

        // Iniciar el viaje en bicicleta
        miBicicleta.empezarViaje();

        // Acelerar la bicicleta
        miBicicleta.acelerar();

        // Detener la bicicleta
        miBicicleta.detener();
    }
}
