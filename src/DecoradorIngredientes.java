public abstract class DecoradorIngredientes extends Bebida {
    protected Bebida bebidaBase;
    public DecoradorIngredientes(Bebida bebidaBase) {
        this.bebidaBase = bebidaBase;
    }
    @Override
    public abstract double obtenerCosto();
}