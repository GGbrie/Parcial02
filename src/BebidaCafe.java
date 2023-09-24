public abstract class BebidaCafe extends Bebida {
    public BebidaCafe() {
        descripcion = "Bebida de Café";
        costo = 8.5;
    }
    @Override
    public double obtenerCosto() {
        return costo;
    }
}