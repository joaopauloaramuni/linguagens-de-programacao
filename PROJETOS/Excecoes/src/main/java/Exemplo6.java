import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo6 {
    public static void main(String[] args) {
        try {
            verificarValor();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            escritor(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            escritor(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
            escritor(e.getMessage());
        }
    }
    private static void verificarValor() throws IllegalArgumentException{
        int valor = -10;
        if (valor < 0) {
            throw new IllegalArgumentException("CODE 900: O valor não pode ser negativo.");
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

// https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html