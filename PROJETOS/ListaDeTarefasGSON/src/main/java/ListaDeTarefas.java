import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        int i = 0;
        do {
            System.out.println("== Aplicativo de Lista de Tarefas ==");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Gerar JSON com as tarefas (objeto para Json)");
            System.out.println("5. Gerar ArrayList com as tarefas (Json para objeto)");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada:");
                    String nomeTarefa = scanner.nextLine();
                    Tarefa objTarefa = new Tarefa();
                    objTarefa.setCod_tarefa(i++);
                    objTarefa.setNome_tarefa(nomeTarefa);
                    // Chame o método para adicionar tarefa
                    adicionarTarefa(tarefas, objTarefa);
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int indice = scanner.nextInt();
                    // Chame o método para remover tarefa
                    removerTarefa(tarefas, indice);
                    break;
                case 3:
                    // Chame o método para listar tarefas
                    listarTarefas(tarefas);
                    break;
                case 4:
                    System.out.println("Gerar o JSON utilizando a biblioteca GSON");
                    gerarJson(tarefas);
                    break;
                case 5:
                    System.out.println("Ler e converter o JSON para uma lista Java");
                    lerJson(tarefas);
                    break;
                case 6:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }

    private static void lerJson(ArrayList<Tarefa> tarefas) {
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("tarefas.json"));
            //Converte String JSON para objeto Java
            ArrayList<Tarefa> arrayListTarefas = gson.fromJson(br, ArrayList.class);
            System.out.println(arrayListTarefas.toString());
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void gerarJson(ArrayList<Tarefa> tarefas) {
        Gson gson = new Gson();
        // converte objetos Java para JSON e retorna JSON como String
        String json = gson.toJson(tarefas);
        try {
            // Escreve Json convertido em arquivo chamado "file.json"
            FileWriter writer = new FileWriter("tarefas.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json);
    }

    private static void listarTarefas(ArrayList<Tarefa> tarefas) {
        int i = 0;
        for (Tarefa tarefa : tarefas) {
            System.out.println("Minha tarefa:" + i + "=" + tarefa);
            i++;
        }
    }

    private static void removerTarefa(ArrayList<Tarefa> tarefas, int indice) {
        tarefas.remove(indice);
    }

    private static void adicionarTarefa(ArrayList<Tarefa> tarefas, Tarefa tarefa) {
        boolean sucesso = tarefas.add(tarefa);
    }
}