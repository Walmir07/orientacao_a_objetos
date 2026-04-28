package lista07.questao01;

public interface DocumentoFiscal {

    public String getIdentificador();
    public double calcularImposto(double valor);
    public String gerarXml();

}
