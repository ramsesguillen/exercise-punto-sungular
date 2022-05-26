public class App {
    public static void main(String[] args) throws Exception {

        Triangle triangle = new Triangle();

        triangle.inicializar();
        System.out.println("================================");
        triangle.imprimirLadoMayor();
        triangle.mensajeEsEquilatero();
    }
}
