import java.io.*;

public class Exemplo3 extends Object{
    public static void main(String[] args) {
        try {
            // Código que pode lançar uma exceção
            int[] array = new int[5];
            int valor = array[10];
            String x = null;
            System.out.println(x.toUpperCase());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.err.println("Exceção: " + e.getMessage());
            escritor(e.getMessage());
        }
    }
    private static void escritor(String msg){
        try {
            String path = "log.txt";
            BufferedWriter buffWrite = new BufferedWriter(new
                    FileWriter(path, true));
            buffWrite.append(msg + "\n");
            buffWrite.close();
        }catch (IOException e){
            System.out.println("Erro ao gravar log. " + e.getMessage());
        }
    }

}