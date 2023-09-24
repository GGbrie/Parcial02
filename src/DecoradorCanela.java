public class DecoradorCanela extends DecoradorIngredientes {
    public DecoradorCanela(Bebida bebida) {
        super(bebida);
        descripcion = bebida.obtenerDescripcion() + " con Canela";
        costo = bebida.obtenerCosto() + 1.5;
    }
    @Override
    public double obtenerCosto() {
        return costo;
    }
}