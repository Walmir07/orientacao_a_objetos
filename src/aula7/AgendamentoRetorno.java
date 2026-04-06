package aula7;

public class AgendamentoRetorno extends Agendamento {

    private double desconto = 0.15;

    public AgendamentoRetorno(Cliente cliente, Veiculo veiculo, String categoria){
       super(cliente, veiculo, categoria);
    }

    @Override
    public double custoTotal(){
        return super.custoTotal() - (super.custoTotal() * desconto);
    }

}
