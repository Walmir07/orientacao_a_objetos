package aula7;

public class AgendamentoUrgente extends Agendamento {

    private double taxaUrgencia;

    public AgendamentoUrgente(Cliente cliente, Veiculo veiculo, String categoria, double taxaUrgencia){
        super(cliente, veiculo, categoria);
        this.taxaUrgencia = taxaUrgencia;
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
        return 0;
    };

    public double calcularCustoTotal(){
        return custoTotal() + taxaUrgencia - calcularDesconto();
    }

}
