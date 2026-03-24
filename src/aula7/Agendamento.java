package aula7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agendamento {

    private Cliente cliente;
    private Veiculo veiculo;
    private List<Servico> servicos;

    public Agendamento(Cliente cliente, Veiculo veiculo){
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.servicos = new ArrayList<>();
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

    public double custoTotal(){
        double valor = 0;
        for(Servico s : servicos){
            valor += s.getPrecoBase();
        }
        return valor;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "\n\tcliente=" + cliente +
                "\n\tserviços=" + servicos.size() +
                "\n\tveículo=" + veiculo +
                "\n}";
    }

}
