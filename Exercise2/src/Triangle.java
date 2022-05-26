import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    private double a;
    private double b;
    private double c;
    Scanner scanner = new Scanner(System.in);


    public void inicializar()
    {
        System.out.println("======= Triángulo =======");
        System.out.println("Agrega el lado A: ");
        this.a = this.getValue();
        System.out.println("Agrega el lado B: ");
        this.b = this.getValue();
        System.out.println("Agrega el lado C: ");
        this.c = this.getValue();
    }


    public void imprimirLadoMayor()
    {
        System.out.println("El lado mayor es: " +  this.getLadoMayor());
    }


    public String getLadoMayor()
    {
        String mayor = "";
        if (a == b && a == c )
            mayor = "A = " + a + ", " + "B = " + b + " y " + "C = " + c;
        else if ( a == b )
            mayor = "A = " + a + " y " + "B = " + b;
        else if ( a == c )
            mayor = "A = " + a + " y " + "C = " + c;
        else if ( b == c )
            mayor = "B = " + b + " y " + "C = " + c;
        else if (a > b && a > c)
            mayor = "A = " + a;
        else if (b > a && b > c)
            mayor = "B = " + b;
        else
            mayor = "C = " + c;

        return mayor;
    }


    public void mensajeEsEquilatero()
    {
        String msg = "";
        msg = (a == b && a == c ) ? "Es un triángulo equilátero." : "No es un triángulo equilátero.";
        System.out.println(msg);
    }


    //* Valida la entrada de datos: solamente permite numeros
    private double getValue()
    {
        double value = 0;
        boolean valid = false;
        while(! valid ) {
            try {
                value = scanner.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Intente de nuevo.");
                scanner.next();
            }
        }

        return value;
    }
}
