
package Controller;

import Factory.ComboFactory; 
import Builder.ComboBuilder;
import Model.ComboBase;

// Parte del patrón MVC
// Coordina la creación y personalización del combo
public class ComboController {
    private ComboFactory factory = new ComboFactory(); // Crea el combo base
    private ComboBuilder builder;                      // Personaliza el combo
    private ComboBase comboActual;                     // Combo final

    // Inicia el combo según el tipo elegido
    public void iniciarCombo(String tipo) {
        ComboBase base = (ComboBase) factory.crearCombo(tipo); // casteo porque Builder necesita ComboBase
        builder = new ComboBuilder(base);
        comboActual = base;
    }

    // Personaliza el combo con los elementos elegidos
    public void personalizarCombo(String bebida, String acompañamiento, String adicional) {
        builder.agregarBebida(bebida)
               .agregarAcompañamiento(acompañamiento)
               .agregarAdicional(adicional);
        comboActual = builder.construir();
    }

    // Devuelve el resumen del combo final
    public String obtenerResumen() {
        return comboActual.getDescripcion() + " - S/. " + comboActual.getPrecio();
    }
}