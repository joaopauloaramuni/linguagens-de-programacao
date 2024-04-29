import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BBB\n");

        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

        //Cadastrar jogadores
        jogadores.add(new Jogador("Alane Dias", 0));
        jogadores.add(new Jogador("Beatriz Reis", 0));
        jogadores.add(new Jogador("Davi Brito", 0));
        jogadores.add(new Jogador("Deniziane Ferreira", 0));
        jogadores.add(new Jogador("Fernanda Bande", 0));
        jogadores.add(new Jogador("Giovanna Lima", 0));
        jogadores.add(new Jogador("Giovanna Pitel", 0));
        jogadores.add(new Jogador("Isabelle Nogueira", 0));
        jogadores.add(new Jogador("Juninho", 0));
        jogadores.add(new Jogador("Leidy Elin", 0));
        jogadores.add(new Jogador("Lucas Henrique", 0));
        jogadores.add(new Jogador("Lucas Luigi", 0));
        jogadores.add(new Jogador("Lucas Pizane", 0));
        jogadores.add(new Jogador("Marcus Vinicius", 0));
        jogadores.add(new Jogador("Matteus Amaral", 0));
        jogadores.add(new Jogador("Maycon Cosmer", 0));
        jogadores.add(new Jogador("MC Bin Laden", 0));
        jogadores.add(new Jogador("Michel Nogueira", 0));
        jogadores.add(new Jogador("Nizam", 0));
        jogadores.add(new Jogador("Raquele Cardozo", 0));
        jogadores.add(new Jogador("Rodriguinho", 0));
        jogadores.add(new Jogador("Thalyta Alves", 0));
        jogadores.add(new Jogador("Vanessa Lopes", 0));
        jogadores.add(new Jogador("Vinicius Rodrigues", 0));
        jogadores.add(new Jogador("Wanessa Camargo", 0));
        jogadores.add(new Jogador("Yasmin Brunet", 0));

        //Votar
        Scanner scn = new Scanner(System.in);
        String votoEm = "";
        Boolean encontrado;
        do{
            System.out.println("Em quem você vota para sair da casa?");
            votoEm = scn.nextLine();
            encontrado = false;
            for (Jogador jog : jogadores){
                //votar na pessoa
                if(jog.getNome().equals(votoEm)){
                    jog.incrementaUmVoto();
                    System.out.println("\nVoto computado com sucesso.");
                    encontrado = true;
                    break;
                }
            }
            if(!"sair".equals(votoEm) && !encontrado){
                System.out.println("Pessoa não encontrada.");
            }
        }while(!"sair".equals(votoEm));

        //Apurar votos
        String eliminado = "";
        int votos = 0;
        //Descobrir quem teve mais votos
        for (Jogador jog : jogadores) {
            if(jog.getVotos() > votos){
                votos = jog.getVotos();
                eliminado = jog.getNome();
            }
        }
        if(!eliminado.equals("")){
            System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu vou conseguir te eliminar com alegria. Com " + votos + " votos, é você quem sai " + eliminado + ".");
        }
    }
}