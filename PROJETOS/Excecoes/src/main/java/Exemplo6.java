public class Exemplo6 {
    public static void main(String[] args) {
        try {
            verificarValor();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void verificarValor() throws IllegalArgumentException{
        int valor = -10;
        if (valor < 0) {
            throw new IllegalArgumentException("CODE 900: O valor não pode ser negativo.");
        }
    }
}

// https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html