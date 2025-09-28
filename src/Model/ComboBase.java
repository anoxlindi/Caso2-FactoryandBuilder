
// se crea el combo base para no repetir en los demás y darle su abstract
package Model;

public abstract class ComboBase implements Combo {
    //atributos
    protected String bebida;
    protected String acompañamiento;
    protected String adicional;

    public void setBebida(String bebida) { this.bebida = bebida; }
    public void setAcompañamiento(String acompañamiento) { this.acompañamiento = acompañamiento; }
    public void setAdicional(String adicional) { this.adicional = adicional; }
    //metodos
    @Override
    public abstract String getDescripcion();

    @Override
    public abstract double getPrecio();
}

