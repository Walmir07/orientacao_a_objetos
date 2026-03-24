package aula7;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agendamento {

    private Cliente cliente;
    private Veiculo veiculo;
    private List<Servico> servicos;
    private String categoria;

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
