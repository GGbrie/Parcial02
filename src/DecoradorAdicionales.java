public abstract class DecoradorAdicionales extends Bebida {
    protected Bebida bebidaBase;

    public DecoradorAdicionales(Bebida bebidaBase) {
        this.bebidaBase = bebidaBase;
    }
}