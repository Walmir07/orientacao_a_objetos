package lista07.questao01;

public class NFSE implements DocumentoFiscal{

    @Override
    public double calcularImposto(double valor){
        return valor * 0.05;
    }

    @Override
    public String gerarXml(String identificador){
        return "<nfse>" + identificador + "</nfse>";
    }

}

