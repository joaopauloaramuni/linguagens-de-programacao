public class OutrosExemplosUmaLinha {
    public static void main(String[] args) {
        System.out.println("Resultado do Fatorial de " + 5 + " é: " + factR(5));
        System.out.println("Resultado do MDC de " + 5 + " é: " + mdc(2, 3));
        System.out.println("Resultado da contagem de pares de " + 5 + " é: " + contPares(5));
        System.out.println("Resultado da potência de " + 5 + " elevado a " + 3 + " é: " + potencia(5, 3));
        System.out.println("Resultado do Fibonacci de " + 5 + " é: " + fibonacci(5));
    }
    private static int fibonacci(int n) {
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
    private static int potencia(int n, int pot) {
        return (pot == 1) ? n : n * potencia(n, pot - 1);
    }
    private static int contPares(int n) {
        return (n == 0 || n == 1) ? 1 : (n % 2 == 0) ? contPares(n - 1) + 1 : contPares(n - 1);
    }
    private static int mdc(int a, int b) {
        return (b == 0) ? a : mdc(b, (a % b));
    }
    private static int factR(int n) {
        return (n == 1) ? 1 : factR(n - 1) * n;
    }
}
