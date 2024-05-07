import java.io.*;

public class Exemplo2 {
    public static void main(String[] args){
        try {
            // Código que pode lançar uma exceção
            FileReader file = new FileReader("arquivo.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
            escritor(e.getMessage());
        } catch(Exception e){
            System.err.println("Minha exceção pai: " + e.getMessage());
            escritor(e.getMessage());
        }
    }

    private static void escritor(String msg){
        try {
           ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("log.dat"));
           out.writeChars(msg);
           out.close();
        }catch (IOException e){
            System.out.println("Erro ao gravar log. " + e.getMessage());
        }
    }
}
