
package Builder;

import Model.ComboBase;
// Aplica el patrón Builder
// Permite personalizar el combo paso a paso
public class ComboBuilder {
     private ComboBase combo;

    // Recibe el combo base creado por el Factory
    public ComboBuilder(ComboBase combo) {
        this.combo = combo;
    }

    public ComboBuilder agregarBebida(String bebida) {
        combo.setBebida(bebida);
        return this;
    }

    public ComboBuilder agregarAcompañamiento(String acompañamiento) {
        combo.setAcompañamiento(acompañamiento);
        return this;
    }

    public ComboBuilder agregarAdicional(String adicional) {
        combo.setAdicional(adicional);
        return this;
    }

    // Devuelve el combo final personalizado
    public ComboBase construir() {
        return combo;
}
}
