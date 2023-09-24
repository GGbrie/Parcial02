public class BebidaTe extends Bebida {
    public BebidaTe() {
        descripcion = "Bebida de Té";
        costo = 5.0;
    }

    @Override
    public double obtenerCosto() {
        return costo;
    }
}