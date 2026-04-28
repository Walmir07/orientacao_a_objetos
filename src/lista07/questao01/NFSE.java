package lista07.questao01;

public class NFSE implements DocumentoFiscal{

    @Override
    public String getIdentificador() {
        return "NFSE";
    }

    @Override
    public double calcularImposto(double valor){
        return valor * 0.05;
    }

    @Override
    public String gerarXml(){
        return "<nfse>" + getIdentificador() + "</nfse>";
    }

}

