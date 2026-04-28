package lista07.questao03;

public class DescontoSegundaUnidade implements Desconto {

    @Override
    public double calcularDesconto(Carrinho carrinho){
        return carrinho.ValorDoProdutoMaisBarato() * 0.50;
    };

}
