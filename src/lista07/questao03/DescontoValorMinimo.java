package lista07.questao03;

public class DescontoValorMinimo implements Desconto {

    @Override
    public double calcularDesconto(Carrinho carrinho){
        return carrinho.subTotalLista() * 0.10;
    };

}
