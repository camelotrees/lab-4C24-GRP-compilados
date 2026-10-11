public class StudentView {
    public void mostrarEstudiante(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void mostrarMayorDeEdad(int edad) {
        if (edad >= 18) {
            System.out.println("El estudiante es mayor de edad");
        } else {
            System.out.println("El estudiante es menor de edad");
        }
    }

    public void mostrarResumen(String nombre, int edad) {
        System.out.println("Estudiante: " + nombre + " (" + edad + " años)");
    }
}