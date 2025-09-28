
package Factory; // VA A RECIBIR UN TIPO DE COMBO
import Model.Combo;
import Model.ComboHamburguesa;
import Model.ComboPollo;
import Model.ComboVegetariano;

 // Aplica el patrón Factory Method
public class ComboFactory {
//DEVOLVER una instancia concreta 
    public Combo crearCombo(String tipo) { //crea el combo segun el elegido
        switch (tipo.toLowerCase()) { // ignora las mayusculas
            case "hamburguesa":
                return new ComboHamburguesa() {};
            case "pollo":
                return new ComboPollo() {};
            case "vegetariano":
                return new ComboVegetariano() {};
            default:
                throw new IllegalArgumentException("Tipo de combo no válido: " + tipo);
        }
    }
}

