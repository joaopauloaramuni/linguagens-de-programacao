public class Fatorial_SemRecursao {
    public static void main(String[] args) {
        int numero = 5;
        calcularFatorial(numero);
    }
    private static void calcularFatorial(int numero) {
        long fatorial = 1;
        if (numero < 0) {
            System.out.println("Fatorial não definido " +
                    "para números negativos.");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
                System.out.println(fatorial);
            }
            System.out.println("O fatorial de " +
                    numero + " é " + fatorial);
        }
    }
}
