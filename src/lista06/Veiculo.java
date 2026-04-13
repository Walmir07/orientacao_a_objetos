package lista06;

public abstract class Veiculo {

    protected String placa;
    protected int anoFabricacao;

    public Veiculo(String placa, int anoFabricacao){
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    public abstract String descricao();

}
