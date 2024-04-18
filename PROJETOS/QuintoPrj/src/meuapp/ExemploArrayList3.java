package meuapp;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList3 {
    public static void main(String[] args) {
        ArrayList<Pessoa> agendaPessoas = new ArrayList<Pessoa>();
        Scanner scn = new Scanner(System.in);
        int opcao = -1;
        do{
            System.out.println("1 - Cadastrar pessoa na agenda.");
            System.out.println("2 - Listar pessoas da agenda.");
            System.out.println("0 - Sair.");
            System.out.println("Digite a opção desejada ");
            opcao = scn.nextInt();
            if(opcao == 1){
                cadastrar(agendaPessoas);
            }else if(opcao == 2){
                listar(agendaPessoas);
            }else if(opcao == 0){
                //Sair
                System.out.println("Encerrando.");
            }else{
                System.out.println("Opção inválida");
            }
        }while(opcao != 0);
    }

    private static void listar(ArrayList<Pessoa> agendaPessoas) {
        for (Pessoa obj : agendaPessoas) {
            System.out.println(obj.toString());
            if(obj.getNome().equals("Joao")){
                System.out.println("Achei o Joao");
            }
        }
    }

    private static void cadastrar(ArrayList<Pessoa> agendaPessoas) {
        Scanner scn = new Scanner(System.in);
        String nome = "";
        String endereco = "";
        String telefone = "";

        System.out.println("Digite o nome: ");
        nome = scn.nextLine();
        System.out.println("Digite o endereco: ");
        endereco = scn.nextLine();
        System.out.println("Digite o telefone: ");
        telefone = scn.nextLine();

        Pessoa objPessoa = new Pessoa(nome, endereco, telefone);
        agendaPessoas.add(objPessoa);

    }
}








