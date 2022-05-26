public class Alumno {
    private String nombre = "";
    private int edad = 0;
    private double calificacion = 0.0;

    public Alumno(String nombre)
    {
        this.nombre = nombre;
    }

    public Alumno(String nombre, int edad, double calificacion)
    {
        this(nombre);
        this.edad = edad;
        this.calificacion = calificacion;
    }


    public void inicializar(int edad, double calificacion)
    {
        this.edad = edad;
        this.calificacion = calificacion;
    }


    public void imprimirDatos()
    {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Calificación: " + this.calificacion);
    }

    public void imprimirEsMayorEdad()
    {
        String msg = "";
        msg = (this.edad >= 18) ? "Es mayor de edad." : "Es menor de edad.";
        System.out.println(msg);
    }

    public void imprimirEstadoPromedio()
    {
        String estado = "";
        if (this.calificacion < 8) estado = "Reprobado";
        else if (this.calificacion >= 8 && this.calificacion < 10) estado = "Aprobado";
        else estado = "Excelente";

        System.out.println("Calidicación: " +estado);
    }
}
