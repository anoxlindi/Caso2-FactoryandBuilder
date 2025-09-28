
import Model.Combo;

// Representa un combo de hamburguesa
   //atributos puestos en el diagrama 
public class ComboHamburguesa implements Combo {
    private String bebida;
    private String acompañamiento;
    private String adicional;
    
    public void setBebida(String bebida) { this.bebida = bebida; }
    public void setAcompañamiento(String acompañamiento) { this.acompañamiento = acompañamiento; }
    public void setAdicional(String adicional) { this.adicional = adicional; }
//metodos
    @Override
    public String getDescripcion() {
        return "Hamburguesa con " + acompañamiento + ", " + bebida + " y " + adicional;
    }

    @Override
    public double getPrecio() {
        return 15.0; // precio del combo
    }
}