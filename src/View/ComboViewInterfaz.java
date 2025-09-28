
package View;

import Controller.ComboController; // Importa el controlador para manejar la lógica del combo
import javax.swing.*;               // Importa los componentes gráficos de Swing
import java.awt.*;                  // Importa layouts y estilos visuales
import java.awt.event.ActionEvent; // Importa eventos de acción (clics)
import java.awt.event.ActionListener; // Importa el listener para manejar acciones del botón

// Clase que representa la interfaz gráfica del sistema de combos
public class ComboViewInterfaz extends JFrame { // Hereda de JFrame para crear una ventana
    private ComboController controller = new ComboController(); // Controlador que coordina la lógica {
    
    // Componentes visuales
    private JComboBox<String> tipoComboBox;     // Lista desplegable para elegir tipo de combo
    private JTextField bebidaField;             // Campo de texto para ingresar bebida
    private JTextField acompañamientoField;     // Campo de texto para ingresar acompañamiento
    private JTextField adicionalField;          // Campo de texto para ingresar adicional
    private JButton confirmarButton;            // Botón para confirmar el pedido
    private JTextArea resumenArea;              // Área de texto para mostrar el resumen del combo

    // Constructor: aquí se arma toda la interfaz
    public ComboViewInterfaz() {
        setTitle("Sistema de Combos");          // Título de la ventana
        setSize(700, 500);                      // tamañito de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la app al cerrar la ventana
        setLayout(new GridLayout(6, 2));        // Organiza los componentes en una cuadrícula de 6 filas y 2 columnas

        // Inicializa los componentes
        tipoComboBox = new JComboBox<>(new String[]{"hamburguesa", "pollo", "vegetariano"}); // Opciones de combo
        bebidaField = new JTextField();         // Campo para bebida
        acompañamientoField = new JTextField(); // Campo para acompañamiento
        adicionalField = new JTextField();      // Campo para adicional
        confirmarButton = new JButton("Confirmar pedido"); // Botón para confirmar
        resumenArea = new JTextArea();          // Área para mostrar el resumen
        resumenArea.setEditable(false);         // El usuario no puede escribir en el resumen

        // Agrega los componentes a la ventana en orden
        add(new JLabel("Tipo de combo:"));      // Etiqueta
        add(tipoComboBox);                      // Lista desplegable
        add(new JLabel("Bebida:"));             // Etiqueta
        add(bebidaField);                       // Campo de texto
        add(new JLabel("Acompañamiento:"));     // Etiqueta
        add(acompañamientoField);               // Campo de texto
        add(new JLabel("Adicional:"));          // Etiqueta
        add(adicionalField);                    // Campo de texto
        add(confirmarButton);                   // Botón
        add(new JLabel());                      // Espacio vacío para alinear
        add(new JLabel("Resumen:"));            // Etiqueta
        add(resumenArea);                       // Área de texto

        // Acción cuando se hace clic en el botón "Confirmar pedido"
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Captura los datos ingresados por el usuario
                String tipo = (String) tipoComboBox.getSelectedItem();
                String bebida = bebidaField.getText();
                String acompañamiento = acompañamientoField.getText();
                String adicional = adicionalField.getText();

                try {
                    // Usa el controlador para crear y personalizar el combo
                    controller.iniciarCombo(tipo);
                    controller.personalizarCombo(bebida, acompañamiento, adicional);

                    // Muestra el resumen en el área de texto
                    resumenArea.setText(controller.obtenerResumen());
                } catch (IllegalArgumentException ex) {
                    // Si el tipo es inválido, muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Tipo de combo no válido");
                }
            }
        });

        setVisible(true); // Muestra la ventana al usuario
    }
}

