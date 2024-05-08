package problema1;

public class libretaNotas {
    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public libretaNotas(String n, double c1, double c2, double c3) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public libretaNotas(String n, double c1, double c2) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = 10;
    }

    public void establecerNombreEstudiante(String n) {
        nombreEstudiante = n;
    }

    public String obtenerNombreEstudiante(){
        return nombreEstudiante;
    }

    public void establecerCalificacion1(double n){
        calificacion1 = n;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public void establecerCalificacion2(double n) {
        calificacion2 = n;
    }

    public double obtenerCalificacion2(){
        return calificacion2;
    }

    public void establecerCalificaion3(double n) {
        calificacion3 = n;
    }

    public double obtnerCalificaion3() {
        return calificacion3;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Libreta de Calificaiones\n"
        + "Nombre del estudiante: %s\n"
        + "Calificacion 1: %.3f\n"
        + "Calificacion 2: %.3f\n"
        + "Calificacion 3: %.3f\n"
        + "Promedio: %.2f\n", obtenerNombreEstudiante(), obtenerCalificacion1(), obtenerCalificacion2(),
                obtnerCalificaion3(), obtenerPromedio());

        return cadena;
    }
}
