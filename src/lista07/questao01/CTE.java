package lista07.questao01;

public class CTE implements DocumentoFiscal{

    @Override
    public String getIdentificador() {
        return "CTE";
    }

    @Override
    public double calcularImposto(double valor){
        return valor * 0.12;
    }

    @Override
    public String gerarXml(){
        return "<cte>" + getIdentificador() + "</cte>";
    }

}
