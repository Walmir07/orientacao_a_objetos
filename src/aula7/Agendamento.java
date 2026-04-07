package aula7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Agendamento {

    protected Cliente cliente;
    protected Veiculo veiculo;
    protected List<Servico> servicos;
    protected String categoria;

    public Agendamento(Cliente cliente, Veiculo veiculo, String categoria){
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.servicos = new ArrayList<>();
        this.categoria = categoria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Servico> getServicos() {
        return Collections.unmodifiableList(servicos);
    }

    public void addServico(Servico servico) {
        servicos.add(servico);
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public abstract double custoTotal();
    public abstract double calcularDesconto();

    public double calcularCustoTotal() {
        double base = custoTotal(); // passo variável
        double desconto = calcularDesconto(); // passo variável
        return base - desconto;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "\n\tcliente= " + cliente +
                "\n\tserviços= " + servicos.size() +
                "\n\tveículo= " + veiculo +
                "\n\tcusto= R$ " + custoTotal() +
                "\n}";
    }

}
