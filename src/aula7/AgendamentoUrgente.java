package aula7;

public class AgendamentoUrgente extends Agendamento {

    private double taxaUrgencia;

    public AgendamentoUrgente(Cliente cliente, Veiculo veiculo, String categoria, double taxaUrgencia){
        super(cliente, veiculo, categoria);
        this.taxaUrgencia = taxaUrgencia;
    }

    @Override
    public double custoTotal(){
        return super.custoTotal() + taxaUrgencia;
    }

}
