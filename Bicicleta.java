 */
public class Bicicleta {
    /***************************************************/
    /******************** Atributos ********************/
    /***************************************************/
    String marca;
    String material;
    int numMarchas;

    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/

    /**
     * Constructor de la clase Bicicleta: Inicializa los atributos de mi bicicleta
     * @param marca
     * @param modelo
     * @param numMarchas
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Bicicleta(String marca, int modelo, int numMarchas){
        this.marca = marca;
        this.modelo = modelo;
        this.numMarchas = numMarchas;
    }

    /**
     * Método que inicia el viaje en bicicleta
     * @return boolean: Indica si la bicicleta pudo empezar a moverse
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean empezarViaje(){
        System.out.println("¡Comencé mi viaje en bicicleta!");
        return true;
    }

    /**
     * Método que detiene la bicicleta
     * @return boolean: Indica si la bicicleta se detuvo con éxito
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean detener(){
        System.out.println("Me detuve en la bicicleta");
        return true;
    }

    /**
     * Método que aumenta la velocidad de la bicicleta
     * @return boolean: Indica si la bicicleta pudo acelerar
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean acelerar(){
        System.out.println("¡Voy más rápido en mi bicicleta!");
        return true;
    }
}
