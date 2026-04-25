public class listaEnlazada {
    private Nodo cabeza;
    private int tamanio;

    public listaEnlazada() {
        cabeza = null;
        tamanio = 0;
    }

    public void insertarAlInicio(String dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        tamanio++;
    }

    public void insertarAlFinal(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) temp = temp.siguiente;
            temp.siguiente = nuevo;
        }
        tamanio++;
    }

    public String eliminarAlInicio() {
        if (cabeza == null) return null;
        String d = cabeza.dato;
        cabeza = cabeza.siguiente;
        tamanio--;
        return d;
    }

    public boolean buscar(String dato) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.dato.equals(dato)) return true;
            temp = temp.siguiente;
        }
        return false;
    }

    public void mostrar() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }

    // Ejercicios
    public int tamanio() { return tamanio; }

    public String obtenerPorIndice(int i) {
        Nodo temp = cabeza;
        for (int j = 0; j < i && temp != null; j++)
            temp = temp.siguiente;
        return temp != null ? temp.dato : null;
    }

    public void eliminarPorValor(String dato) {
        if (cabeza == null) return;

        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo temp = cabeza;
        while (temp.siguiente != null) {
            if (temp.siguiente.dato.equals(dato)) {
                temp.siguiente = temp.siguiente.siguiente;
                return;
            }
            temp = temp.siguiente;
        }
    }

    public void invertir() {
        Nodo prev = null, curr = cabeza;
        while (curr != null) {
            Nodo next = curr.siguiente;
            curr.siguiente = prev;
            prev = curr;
            curr = next;
        }
        cabeza = prev;
    }
}