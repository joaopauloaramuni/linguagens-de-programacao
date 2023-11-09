public class Fatorial_ComRecursao {
    public static void main(String[] args) {
        int numero = 5;
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero +
                " é " + resultado);
    }
    public static int calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
    public static int calcularFatorial2(int n) {
        return (n == 0) ? 1 : n * calcularFatorial(n - 1);
    }
}
