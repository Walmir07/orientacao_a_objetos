package lista07.questao03;

public class RegraFreteGratis implements Regra {

    @Override
    public double getDesconto(Carrinho carrinho) {

        if(carrinho.getItens().size() > 5){
            return carrinho.getValorFrete();
        }

        return 0;

    }

}
