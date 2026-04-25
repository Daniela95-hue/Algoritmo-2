public class listaDoble {
    NodoDoble cabeza, cola, actual;
    int tam;

    public void agregarCancion(String c) {
        NodoDoble n = new NodoDoble(c);
        if (cola == null) cabeza = cola = actual = n;
        else {
            cola.sig = n;
            n.ant = cola;
            cola = n;
        }
        tam++;
    }

    public String siguiente() {
        if (actual != null && actual.sig != null)
            actual = actual.sig;
        return actual.dato;
    }

    public String anterior() {
        if (actual != null && actual.ant != null)
            actual = actual.ant;
        return actual.dato;
    }

    public void eliminarActual() {
        if (actual == null) return;

        if (actual.ant != null)
            actual.ant.sig = actual.sig;
        else cabeza = actual.sig;

        if (actual.sig != null)
            actual.sig.ant = actual.ant;
        else cola = actual.ant;

        actual = actual.sig != null ? actual.sig : actual.ant;
    }

    public void mostrarAdelante() {
        NodoDoble t = cabeza;
        while (t != null) {
            System.out.print(t.dato + " <-> ");
            t = t.sig;
        }
        System.out.println();
    }

    public void mostrarAtras() {
        NodoDoble t = cola;
        while (t != null) {
            System.out.print(t.dato + " <-> ");
            t = t.ant;
        }
        System.out.println();
    }
}