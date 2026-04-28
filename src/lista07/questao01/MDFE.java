package lista07.questao01;

public class MDFE implements DocumentoFiscal{

    @Override
    public String getIdentificador() {
        return "MDFE";
    }

    @Override
    public double calcularImposto(double valor){
        return valor * 0.08;
    }

    @Override
    public String gerarXml(){
        return "<mdfe>" + getIdentificador() + "</mdfe>";
    }

}
