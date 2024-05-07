public class Exemplo4 {
    public static void main(String[] args) {
        try {
            // Código que pode lançar uma exceção
            // ...
        } catch (Exception e) {
            System.err.println("Exceção: " + e.getMessage());
        } finally {
            // Código a ser executado sempre, mesmo se ocorrer uma exceção
            System.out.println("Bloco finally executado.");
        }
    }
}
