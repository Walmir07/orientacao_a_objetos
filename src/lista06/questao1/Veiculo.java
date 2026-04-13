package lista06.questao1;

public abstract class Veiculo {

    protected String placa;
    protected int anoFabricacao;
    protected String categoria;

    public Veiculo(String placa, int anoFabricacao, String categoria){
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.categoria = categoria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public abstract String descricao();

}
