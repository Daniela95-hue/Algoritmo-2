public class SistemaTurnos {

    private static class Nodo {
        String cliente;
        Nodo siguiente;
        Nodo(String c) { cliente = c; }
    }

    private Nodo frente, fin;

    public void enqueue(String c) {
        Nodo n = new Nodo(c);
        if (fin == null) frente = fin = n;
        else {
            fin.siguiente = n;
            fin = n;
        }
    }

    public String dequeue() {
        if (frente == null) return null;
        String c = frente.cliente;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        return c;
    }

    public void mostrarFila() {
        Nodo t = frente;
        while (t != null) {
            System.out.print(t.cliente + " ");
            t = t.siguiente;
        }
        System.out.println();
    }

    public int posicion(String c) {
        Nodo t = frente;
        int i = 1;
        while (t != null) {
            if (t.cliente.equals(c)) return i;
            t = t.siguiente;
            i++;
        }
        return -1;
    }

    public void saltarTurno() {
        if (frente == null || frente.siguiente == null) return;
        Nodo primero = frente;
        frente = frente.siguiente;
        fin.siguiente = primero;
        primero.siguiente = null;
        fin = primero;
    }
}