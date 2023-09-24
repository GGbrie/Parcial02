public class Main {
    public static void main(String[] args) {
        Bebida bebidaSeleccionada = new BebidaTe();
        bebidaSeleccionada = new DecoradorCanela(bebidaSeleccionada);
        bebidaSeleccionada = new DecoradorChocolate(bebidaSeleccionada);

        System.out.println("Descripción de la Bebida : " + bebidaSeleccionada.obtenerDescripcion());
        System.out.println("Total de la Bebida: " + bebidaSeleccionada.obtenerCosto());
    }
}