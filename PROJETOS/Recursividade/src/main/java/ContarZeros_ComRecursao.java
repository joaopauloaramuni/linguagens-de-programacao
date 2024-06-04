public class ContarZeros_ComRecursao {
    public static void main(String[] args) {
        int numero = 102030;
        int resultado = contarZeros(numero);
        System.out.println("Resultado: " + resultado);
    }
    private static int contarZeros(int numero) {
        //caso base
        if(numero == 0)
            return 0;
        int ultimoDigito = numero % 10;
        if(ultimoDigito == 0){
            return 1 + contarZeros(numero / 10);
        }else{
            return contarZeros(numero / 10);
        }
    }
}
