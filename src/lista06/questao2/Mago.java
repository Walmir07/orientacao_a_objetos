package lista06.questao2;

public class Mago extends Personagem {

    private int danoMagico;
    private int custoMana;
    private int manaAtual;

    public Mago(String nome, int pontosDeVida, int danoMagico, int custoMana, int manaAtual){
        super(nome, pontosDeVida);
        this.danoMagico = danoMagico;
        this.custoMana = custoMana;
        this.manaAtual = manaAtual;
    }

    public int getManaAtual(){
        return manaAtual;
    }

    @Override
    public void executarAtaque(Personagem alvo){
        if(manaAtual > 0 && manaAtual > custoMana){
            alvo.receberDano(danoMagico);
            manaAtual -= custoMana;
        }
    };

    @Override
    public String getClasse() {
        return "Mago";
    }

}
