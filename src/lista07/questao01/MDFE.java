package lista07.questao01;

public class MDFE implements DocumentoFiscal{

    @Override
    public double calcularImposto(double valor){
        return valor * 0.08;
    }

    @Override
    public String gerarXml(String identificador){
        return "<mdfe>" + identificador + "</mdfe>";
    }

}
