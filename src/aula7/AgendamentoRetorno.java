package aula7;

public class AgendamentoRetorno extends Agendamento {

    private double desconto = 0.15;

    public AgendamentoRetorno(Cliente cliente, Veiculo veiculo, String categoria){
       super(cliente, veiculo, categoria);
    }

    @Override
    public double custoTotal(){
        double valor = 0;
        for(Servico s : servicos){
            valor += s.getPrecoBase();
        }

        if(categoria.equals("PESADO")){
            return valor + valor * 0.3;
        }

        return valor;
    }

    public double calcularDesconto(){
       return (custoTotal() * desconto);
    };

    public double calcularCustoTotal(){
        return custoTotal() - calcularDesconto();
    }

}
