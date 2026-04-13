package lista06.questao1;

import lista06.questao1.Veiculo;

public class VeiculoPessoa extends Veiculo {

    private String cpfLocatorio;

    public VeiculoPessoa(String placa, int anoFabricacao, String categoria, String cpfLocatorio){
        super(placa, anoFabricacao, categoria);
        this.cpfLocatorio = cpfLocatorio;
    }

    public String getCpfLocatorio() {
        return cpfLocatorio;
    }

    public void setCpfLocatorio(String cpfLocatorio) {
        this.cpfLocatorio = cpfLocatorio;
    }

    @Override
    public String descricao() {
        return "Veículo para pessoa {" +
                "\n\tPlaca: " + getPlaca() +
                "\n\tAno de fabricação: " + getPlaca() +
                "\n\tCategoria: " + getCategoria() +
                "\n\tCPF do locatório: " + getCpfLocatorio() +
                "\n}";
    }
}
