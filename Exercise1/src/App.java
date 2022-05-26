public class App {
    public static void main(String[] args) throws Exception {


        Numbers numbers = new Numbers();

        numbers.inicializar();
        System.out.println("Numero mayor: " + numbers.calcularMayor());
        System.out.println("Numero menor: " + numbers.calcularMenor());
    }
}
