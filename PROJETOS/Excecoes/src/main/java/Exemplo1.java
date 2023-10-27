import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("Exceções");
        try {
            // Código que pode lançar uma exceção
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.err.println("Ocorreu uma exceção: " + e.getMessage());
            escritor(e.getMessage());
        }
    }
    private static void escritor(String msg){
        try {
            String path = "log.txt";
            BufferedWriter buffWrite = new BufferedWriter(new
                    FileWriter(path));
            buffWrite.append(msg);
            buffWrite.close();
        }catch (IOException e){
            System.out.println("Erro ao gravar log. " + e.getMessage());
        }
    }

}
