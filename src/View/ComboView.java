
package View; 

import Controller.ComboController; // Importa el controlador para coordinar la lógica
import java.util.Scanner; // Importa Scanner para leer entrada del usuario por consola

// Clase que representa la Vista en el patrón MVC
// Se encarga de interactuar con el usuario

public class ComboView {
    private ComboController controller = new ComboController(); // Instancia del controlador
    private Scanner scanner = new Scanner(System.in); // Scanner para capturar entrada del usuario

    // Método principal que muestra las opciones y captura la selección del usuario
    public void mostrarOpciones() {
        System.out.println("=== Bienvenido al sistema de combos ==="); // Mensaje de bienvenida
        System.out.println("Tipos disponibles: hamburguesa, pollo, vegetariano"); // Tipos de combo disponibles
        System.out.print("Elige tipo de combo: "); // Solicita al usuario que elija un tipo
        String tipo = scanner.nextLine(); // Captura el tipo ingresado

        try {
            controller.iniciarCombo(tipo); // Llama al controlador para crear el combo base

            // Captura los elementos personalizados del combo
            System.out.print("Elige bebida: ");
            String bebida = scanner.nextLine();

            System.out.print("Elige acompañamiento: ");
            String acompañamiento = scanner.nextLine();

            System.out.print("Elige adicional: ");
            String adicional = scanner.nextLine();

            // Llama al controlador para personalizar el combo con los datos ingresados
            controller.personalizarCombo(bebida, acompañamiento, adicional);

            // Muestra el resumen final del combo
            mostrarResumen();

        } catch (IllegalArgumentException e) {
            // Si el tipo de combo no es válido, muestra un mensaje de error
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }

    // Método que muestra el resumen del combo final
    public void mostrarResumen() {
        System.out.println("\n=== Resumen del pedido ==="); // Título del resumen
        System.out.println(controller.obtenerResumen()); // Muestra la descripción y precio del combo
    }
}
