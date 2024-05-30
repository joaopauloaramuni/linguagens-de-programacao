public class Palindromo_ComRecursao {
    public static void main(String[] args) {
        String palavra = "ARARA";
        int resultado = isPalindrome(palavra, 0,
                palavra.length() - 1);
        System.out.println("Resultado: " + resultado);
    }
    private static int isPalindrome(String palavra, int left, int right) {
        //caso base
        if(left >= right)
            return 1;
        if(palavra.charAt(left) != palavra.charAt(right))
            return 0;
        return isPalindrome(palavra, left + 1, right - 1);
    }
}
