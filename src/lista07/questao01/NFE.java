package lista07.questao01;

public class NFE implements DocumentoFiscal{

    @Override
    public String getIdentificador() {
        return "NFL";
    }

    @Override
    public double calcularImposto(double valor){
        return valor * 0.18;
    }

    @Override
    public String gerarXml(){
        return "<nfe>" + getIdentificador() + "</nfe>";
    }

}
