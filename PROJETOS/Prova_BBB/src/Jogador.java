public class Jogador {

    private String nome;
    private int votos;

    public Jogador(String nome, int votos) {
        this.nome = nome;
        this.votos = votos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void incrementaUmVoto() {
        this.votos = getVotos() + 1;
    }
    public int getVotos() {
        return votos;
    }
}
