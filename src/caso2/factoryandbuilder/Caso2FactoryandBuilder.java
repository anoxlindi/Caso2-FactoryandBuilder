package caso2.factoryandbuilder; 

import View.ComboView; // Importa la vista que inicia la interacción con el usuario

/**
 * Clase principal del proyecto
 * Aquí comienza la ejecución del programa
 * @author Analia
 */
public class Caso2FactoryandBuilder {

    /**
     * Método main: punto de entrada del programa
     * @param args argumentos de línea de comandos (no usados aquí)
     */
    public static void main(String[] args) {
        ComboView vista = new ComboView(); // Crea una instancia de la vista
        vista.mostrarOpciones();           // Llama al método que inicia el flujo de interacción
    }
}
