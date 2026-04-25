public class MainArray {
    public static void main(String[] args) {
        GestorCalificaciones g = new GestorCalificaciones(10);

        g.agregar(3.5);
        g.agregar(4.0);
        g.agregar(2.5);
        g.agregar(5.0);
        g.agregar(3.2);
        g.agregar(1.8);
        g.agregar(4.7);
        g.agregar(2.9);
        g.agregar(3.8);
        g.agregar(4.1);

        System.out.println("Promedio: " + g.promedio());
        System.out.println("Mayor: " + g.mayor());
        System.out.println("Menor: " + g.menor());
        System.out.println("Aprobados: " + g.contarAprobados(3.0));
    }
}