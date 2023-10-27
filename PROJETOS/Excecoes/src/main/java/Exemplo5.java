public class Exemplo5 {
    public static void main(String[] args) {
        String numeroString = "A";  // String que não é um número válido
        //String numeroString = "1";  // String que é um número válido
        converteNumero(numeroString);
    }
    private static void converteNumero(String numeroString) throws NumberFormatException {
        try {
            int numeroInt = Integer.parseInt(numeroString);
            System.out.println("Número convertido: " + numeroInt);
        } catch (NumberFormatException e) {
            System.err.println("Erro de conversão: " + e.getMessage());
        }
    }
}
