import java.util.Scanner;

public class Main {
    
    /*Escreva um algoritmo que calcule a quantidade de dinheiro gasto por
    um fumante ao longo de sua vida. O programa deverá solicitar o número
    de anos que a pessoa fuma, o número de cigarros fumados por dia e o
    preço médio de um maço de cigarros.
    Para o cálculo considere que um maço de cigarros tenha 20 unidades.
    Ao final mostrar:
    Número de cigarros fumados ao longo da vida.
    Total gasto
     */

    private static int numeroCigarrosAoLongoVida(int anosFumando, int cigarrosDia){
        return anosFumando * 365 * cigarrosDia;
    }
    private static double totalGastoAoLongoVida(int totalCigarrosVida, double precoMedio){
        return (totalCigarrosVida / 20) * precoMedio;
    }
    private static double totalTempoPerdidoAoLongoVida(int totalCigarrosVida){
        return (totalCigarrosVida * 11) / 60;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o número de anos fumando: ");
        int anosFumando = scn.nextInt();
        System.out.println("Digite o número de cigarros fumados por dia: ");
        int cigarrosDia = scn.nextInt();
        System.out.println("Digite o preço médio do maço de cigarros: ");
        double precoMedio = scn.nextDouble();
        int totalCigarrosVida = numeroCigarrosAoLongoVida(anosFumando, cigarrosDia);
        double totalGastoVida = totalGastoAoLongoVida(totalCigarrosVida, precoMedio);
        double tempoVidaPerdido = totalTempoPerdidoAoLongoVida(totalCigarrosVida);
        System.out.println("Total de cigarros fumados na vida: " + totalCigarrosVida);
        System.out.println("Total gasto na vida: " + totalGastoVida);
        System.out.println("Total de tempo perdido em horas: " + tempoVidaPerdido);
    }
}