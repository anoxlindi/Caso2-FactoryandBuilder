
package Model;

import Model.Combo; // como ya es abstract no es necesario repetir los atributos
        
public abstract class ComboVegetariano extends ComboBase {

    @Override
    public String getDescripcion() {
        return "Hamburguesa con " + acompañamiento + ", " + bebida + " y " + adicional;
    }

    @Override
    public double getPrecio() {
        return 13.50; // solo le cambiaremos el precio
}}
