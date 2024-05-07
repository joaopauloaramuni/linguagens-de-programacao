import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo5 {
    public static void main(String[] args) {
        String numeroString = "A";  // String que não é um número válido
        //String numeroString = "1";  // String que é um número válido
        try {
            converteNumero(numeroString);
        } catch (NumberFormatException e) {
            System.err.println("Erro de conversão: " + e.getMessage());
            escritor(e.getMessage());
        }
    }
    private static void converteNumero(String numeroString) throws NumberFormatException{
            int numeroInt = Integer.parseInt(numeroString);
            System.out.println("Número convertido: " + numeroInt);
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
