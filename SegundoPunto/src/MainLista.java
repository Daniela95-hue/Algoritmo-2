public class MainLista {
    public static void main(String[] args) {
        listaEnlazada l = new listaEnlazada();

        l.insertarAlInicio("A");
        l.insertarAlFinal("B");
        l.insertarAlFinal("C");
        l.insertarAlFinal("D");
        l.insertarAlFinal("E");

        l.mostrar();

        l.eliminarAlInicio();
        l.mostrar();

        System.out.println("Buscar C: " + l.buscar("C"));

        l.invertir();
        l.mostrar();
    }
}
