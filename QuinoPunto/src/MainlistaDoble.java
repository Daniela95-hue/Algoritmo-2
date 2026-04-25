public class MainlistaDoble {
    public static void main(String[] args) {
        listaDoble l = new listaDoble();

        l.agregarCancion("A");
        l.agregarCancion("B");
        l.agregarCancion("C");

        l.mostrarAdelante();

        l.siguiente();
        l.eliminarActual();

        l.mostrarAdelante();
        l.mostrarAtras();
    }
}