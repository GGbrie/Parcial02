public class DecoradorLeche extends DecoradorIngredientes {
    public DecoradorLeche(Bebida bebida) {
        super(bebida);
        descripcion = bebida.obtenerDescripcion() + " con Leche";
        costo = bebida.obtenerCosto() + 0.75;
    }
    @Override
    public double obtenerCosto() {
        return costo;
    }
}