public class DecoradorChocolate extends DecoradorIngredientes {
    public DecoradorChocolate(Bebida bebida) {
        super(bebida);
        descripcion = bebida.obtenerDescripcion() + " y Chocolate";
        costo = bebida.obtenerCosto() + 2.0;
    }
    @Override
    public double obtenerCosto() {
        return costo;
    }
}