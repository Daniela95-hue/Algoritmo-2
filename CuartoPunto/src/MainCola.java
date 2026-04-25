public class MainCola {
    public static void main(String[] args) {
        SistemaTurnos c = new SistemaTurnos();

        c.enqueue("Juan");
        c.enqueue("Ana");
        c.enqueue("Luis");

        c.mostrarFila();

        c.dequeue();
        c.mostrarFila();

        System.out.println("Posición Luis: " + c.posicion("Luis"));

        c.saltarTurno();
        c.mostrarFila();
    }
}