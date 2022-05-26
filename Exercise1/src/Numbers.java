import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    private int numbersLength = 3; //* Cambiar el valor si se requiere pedir más numeros.
    private List<Double> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void inicializar()
    {
        double number = 0;

        System.out.print("========= Ingrese sólo numeros ========\n");

        for (int i = 0; i < this.numbersLength; i++) {
            boolean valid = false;
            while(! valid ) {
                System.out.println("Valor "+(i+1)+": ");
                try {
                    number = scanner.nextDouble();
                    this.numbers.add(number);
                    valid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Intente de nuevo.");
                    scanner.next();
                }
            }
        }

        Collections.sort(this.numbers);
    }


    public double calcularMayor()
    {
        return this.numbers.get(this.numbers.size() - 1);
    }


    public double calcularMenor()
    {
        return this.numbers.get(0);
    }
}
