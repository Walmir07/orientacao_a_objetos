package lista06.questao2;

public class Arqueiro extends Personagem{

    private int danoFlexa;
    private int flechasRestantes;

    public Arqueiro(String nome, int pontosDeVida, int danoFlexa, int flexasRestantes){
        super(nome, pontosDeVida);
        this.danoFlexa = danoFlexa;
        this.flechasRestantes = flexasRestantes;
    }

    public int getFlechasRestantes(){
        return flechasRestantes;
    }


    @Override
    public void executarAtaque(Personagem alvo) {
        if(flechasRestantes > 0){
            alvo.receberDano(danoFlexa);
            flechasRestantes--;
        }
    }

    @Override
    public String getClasse() {
        return "Arqueiro";
    }

}
