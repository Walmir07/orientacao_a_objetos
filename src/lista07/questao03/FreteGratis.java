package lista07.questao03;

public class FreteGratis implements Desconto {

    @Override
    public double calcularDesconto(Carrinho carrinho){
        return carrinho.getValorFrete();
    };

}
