public abstract class Bebida {
    protected String descripcion;
    protected double costo;
    public String obtenerDescripcion() {
        return descripcion;
    }
    public abstract double obtenerCosto();
}