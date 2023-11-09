public class OutrosExemplos {
    public static void main(String[] args) {
        int n = 5;
        int pot = 3;
        int a = 2, b = 3;
        int resultado = 0;
        resultado = factR(n);
        System.out.println("Resultado do Fatorial de " + n + " é: " + resultado);
        resultado = mdc(a, b);
        System.out.println("Resultado do MDC de " + n + " é: " + resultado);
        resultado = contPares(n);
        System.out.println("Resultado da contagem de pares de " + n + " é: " + resultado);
        resultado = potencia(n, pot);
        System.out.println("Resultado da potência de " + n + " elevado a " + pot + " é: " + resultado);
        resultado = fibonacci(n);
        System.out.println("Resultado do Fibonacci de " + n + " é: " + resultado);
        contagemRegressiva(30);
        String texto = "João";
        revertePalavra(texto, texto.length() - 1);

    }
    private static void revertePalavra(String word, int index) {
        if(index >= 0){
            System.out.print(word.charAt(index));
            revertePalavra(word, index - 1);
        }
    }
    private static void contagemRegressiva(int n) {
        if(n >= 0){
            System.out.println(n);
            contagemRegressiva(n-1);
        }
    }

    private static int fibonacci(int n) {
        if (n < 2){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    private static int potencia(int n, int pot) {
        if(pot == 1){
            return n;
        }
        return n * potencia(n, pot - 1);
    }
    private static int contPares(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        if (n % 2 == 0){
            return contPares(n - 1) + 1;
        }else{
            return contPares(n - 1);
        }
    }
    private static int mdc(int a, int b) {
        if (b == 0){
            return a;
        }
        return mdc(b, (a % b));
    }
    private static int factR(int n) {
        int result;
        if (n==1){
            return 1;
        }
        //Executa a chamada recursiva a factR();
        result = factR(n - 1) * n;
        return result;
    }

}
