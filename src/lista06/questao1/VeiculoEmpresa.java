package lista06.questao1;

import lista06.questao1.Veiculo;

public class VeiculoEmpresa extends Veiculo {

    private String cnpjContratante;
    private String codigoFrota;

    public VeiculoEmpresa(String placa, int anoFabicacao, String categoria, String cnpjContratante){
        super(placa, anoFabicacao, categoria);
        this.cnpjContratante = cnpjContratante;

        if (categoria.toUpperCase().equals("LEVE")) {
            this.codigoFrota = "L1010"; // Frota de leves
        } else if (categoria.toUpperCase().equals("MEDIO")){
            this.codigoFrota = "M1111"; // Frota de medios
        } else if (categoria.toUpperCase().equals("PESADO")){
            this.codigoFrota = "P1212"; // Frota de pesados
        }

    }

    public String getCnpjContratante() {
        return cnpjContratante;
    }

    public void setCnpjContratante(String cnpjContratante) {
        this.cnpjContratante = cnpjContratante;
    }

    public String getCodigoFrota() {
        return codigoFrota;
    }

    @Override
    public String descricao() {
        return "Veículo para empresa {" +
                "\n\tPlaca: " + getPlaca() +
                "\n\tAno de fabricação: " + getPlaca() +
                "\n\tCategoria: " + getCategoria() +
                "\n\tCódigo de frota: " + getCodigoFrota() +
                "\n\tCNPJ do contratante: " + getCnpjContratante()+
                "\n}";
    }
}
