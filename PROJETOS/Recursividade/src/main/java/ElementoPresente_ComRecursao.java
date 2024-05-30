import java.util.ArrayList;

public class ElementoPresente_ComRecursao {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(8);
        array.add(99);
        int resultado = elementoPresente(array, 99, array.size());
        System.out.println("Resultado: " + resultado);
    }
    //Método recursivo para verificar se um elemento está presente no array
    private static int elementoPresente(ArrayList<Integer> array, int elemento, int tamanho) {
        //caso base
        if(tamanho == 0){
            return 0;
        }
        if(array.get(tamanho - 1) == elemento){
            return 1;
        }
        return elementoPresente(array, elemento, tamanho - 1);
    }
}
