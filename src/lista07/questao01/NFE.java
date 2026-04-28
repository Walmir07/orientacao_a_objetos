package lista07.questao01;

public class NFE implements DocumentoFiscal{

    @Override
    public double calcularImposto(double valor){
        return valor * 0.18;
    }

    @Override
    public String gerarXml(String identificador){
        return "<nfe>" + identificador + "</nfe>";
    }

}
