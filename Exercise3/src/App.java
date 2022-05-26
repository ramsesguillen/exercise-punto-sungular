public class App {
    public static void main(String[] args) throws Exception {

        Alumno alumno1 = new Alumno("Juan Carlos Peña");
        Alumno alumno2 = new Alumno("Guillé Salinas", 25, 10);

        alumno1.imprimirDatos();
        alumno1.imprimirEsMayorEdad();
        alumno1.imprimirEstadoPromedio();
        System.out.println("==================================");
        alumno2.imprimirDatos();
        alumno2.imprimirEsMayorEdad();
        alumno2.imprimirEstadoPromedio();
    }
}
