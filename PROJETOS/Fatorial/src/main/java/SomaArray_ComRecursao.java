import java.util.ArrayList;

public class SomaArray_ComRecursao {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        System.out.println("Resultado: " + somaArray(array, array.size() - 1));
    }
    //Método para calcular a soma de um array recursivamente
    private static int somaArray(ArrayList<Integer> array, int indice) {
        //caso base
        if(indice == 0){
            return array.get(0);
        }
        //passo recursivo
        return array.get(indice) + somaArray(array, indice - 1);
    }
}
