package lista06.questao2;

public class Guerreiro extends Personagem {

    private int danoEspada;

    public Guerreiro(String nome, int pontosDeVida, int danoEspada){
        super(nome, pontosDeVida);
        this.danoEspada = danoEspada;
    }

    @Override
    public void executarAtaque(Personagem alvo) {
        alvo.receberDano(danoEspada);
    }

    @Override
    public String getClasse() {
        return "Guerreiro";
    }

}
