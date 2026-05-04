package lista07.questao03;

public class RegraDescontoValorMinimo implements Regra {

    @Override
    public double getDesconto(Carrinho carrinho){
        double subtotal = 0;

        for(Item item : carrinho.getItens()){
            subtotal += item.getPrecoUnitario() * item.getQuantidade();
        }

        if(subtotal > 300) {
            return subtotal * 0.10;
        }

        return 0;
    };

}
