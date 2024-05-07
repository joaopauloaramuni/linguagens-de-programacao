import java.io.*;

public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("Exceções");
        try {
            // Código que pode lançar uma exceção
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("CODE 999 - Ocorreu uma exceção do tipo ArithmeticException: " + e.getMessage());
            escritor(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("CODE 777 - Ocorreu uma exceção do tipo NULL: " + e.getMessage());
            escritor(e.getMessage());
        } catch (Exception e) {
            System.err.println("CODE 666 - Ocorreu uma exceção genérica: " + e.getMessage());
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

    private static void leitor(String path) throws IOException {
        File arquivo = new File(path);
        if (arquivo.exists()) {
            BufferedReader buffRead = new BufferedReader(new FileReader(path));
            String linha = "";
            while (true) {
                if (linha != null) {
                    System.out.println(linha);

                } else
                    break;
                linha = buffRead.readLine();
            }
            buffRead.close();
        } else {
            throw new FileNotFoundException("Arquivo não encontrado.");
        }
    }

}
