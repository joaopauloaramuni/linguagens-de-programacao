import java.util.ArrayList;

public class Exemplo3 extends Object{
    public static void main(String[] args) {
        try {
            // Código que pode lançar uma exceção
            int[] array = new int[5];
            int valor = array[10];
            String x = null;
            System.out.println(x.toUpperCase());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.err.println("Exceção: " + e.getMessage());
        }
    }
}
