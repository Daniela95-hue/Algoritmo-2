public class GestorCalificaciones {
    private double[] calificaciones;
    private int totalEstudiantes;

    public GestorCalificaciones(int capacidad) {
        calificaciones = new double[capacidad];
        totalEstudiantes = 0;
    }

    public boolean agregar(double nota) {
        if (totalEstudiantes >= calificaciones.length) return false;
        calificaciones[totalEstudiantes++] = nota;
        return true;
    }

    public double obtener(int i) {
        if (i < 0 || i >= totalEstudiantes) return 0;
        return calificaciones[i];
    }

    public double promedio() {
        double suma = 0;
        for (int i = 0; i < totalEstudiantes; i++) suma += calificaciones[i];
        return totalEstudiantes == 0 ? 0 : suma / totalEstudiantes;
    }

    public double mayor() {
        double max = calificaciones[0];
        for (int i = 1; i < totalEstudiantes; i++)
            if (calificaciones[i] > max) max = calificaciones[i];
        return max;
    }

    // E1.1
    public double menor() {
        double min = calificaciones[0];
        for (int i = 1; i < totalEstudiantes; i++)
            if (calificaciones[i] < min) min = calificaciones[i];
        return min;
    }

    // E1.2
    public int buscarNota(double nota) {
        for (int i = 0; i < totalEstudiantes; i++)
            if (calificaciones[i] == nota) return i;
        return -1;
    }

    // E1.3
    public void ordenarBurbuja() {
        for (int i = 0; i < totalEstudiantes - 1; i++) {
            for (int j = 0; j < totalEstudiantes - i - 1; j++) {
                if (calificaciones[j] > calificaciones[j + 1]) {
                    double temp = calificaciones[j];
                    calificaciones[j] = calificaciones[j + 1];
                    calificaciones[j + 1] = temp;
                }
            }
        }
    }

    // E1.4
    public int contarAprobados(double min) {
        int c = 0;
        for (int i = 0; i < totalEstudiantes; i++)
            if (calificaciones[i] >= min) c++;
        return c;
    }
}