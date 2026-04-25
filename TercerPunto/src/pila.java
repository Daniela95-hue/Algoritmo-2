public class pila {
    private String[] datos;
    private int tope;

    public pila(int cap) {
        datos = new String[cap];
        tope = -1;
    }

    public boolean push(String x) {
        if (tope == datos.length - 1) return false;
        datos[++tope] = x;
        return true;
    }

    public String pop() {
        if (tope == -1) return null;
        return datos[tope--];
    }

    public String peek() {
        return tope == -1 ? null : datos[tope];
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public void mostrar() {
        for (int i = tope; i >= 0; i--)
            System.out.println(datos[i]);
    }
}