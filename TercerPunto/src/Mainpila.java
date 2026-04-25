public class Mainpila {
    public static void main(String[] args) {
        pila p = new pila(5);

        p.push("A");
        p.push("B");
        p.push("C");

        p.mostrar();

        p.pop();
        System.out.println("Después de pop:");
        p.mostrar();
    }
}