package Model;


import Model.Combo;

// Representa un combo de hamburguesa
   //atributos puestos en el diagrama 
public abstract class ComboHamburguesa extends ComboBase {
 
    @Override
    public String getDescripcion() {
        return "Hamburguesa con " + acompañamiento + ", " + bebida + " y " + adicional;
    }

    @Override
    public double getPrecio() {
        return 15.0; // precio del combo
    }
}