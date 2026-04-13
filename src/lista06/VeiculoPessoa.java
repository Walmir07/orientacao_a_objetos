package lista06;

public class VeiculoPessoa extends Veiculo {

    private String cpfLocatorio;

    public VeiculoPessoa(String placa, int anoFabricacao, String cpfLocatorio){
        super(placa, anoFabricacao);
        this.cpfLocatorio = cpfLocatorio;
    }

    @Override
    public String descricao() {
        return "";
    }
}
