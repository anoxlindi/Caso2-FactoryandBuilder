
package Model;
// aqui se hace lo mismo que en hamburguesa 
public class ComboPollo implements Combo {
    private String bebida;
    private String acompañamiento;
    private String adicional;

    public void setBebida(String bebida) { this.bebida = bebida; }
    public void setAcompañamiento(String acompañamiento) { this.acompañamiento = acompañamiento; }
    public void setAdicional(String adicional) { this.adicional = adicional; }

    @Override
    public String getDescripcion() {
        return "Hamburguesa con " + acompañamiento + ", " + bebida + " y " + adicional;
    }

    @Override
    public double getPrecio() {
        return 14.0; // solo le cambiaremos el precio
} }
