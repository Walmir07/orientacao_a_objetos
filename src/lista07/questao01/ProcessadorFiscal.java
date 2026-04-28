package lista07.questao01;

public class ProcessadorFiscal {

    public String processar(DocumentoFiscal documento, double valor, String identificador) {

        double imposto = documento.calcularImposto(valor);
        String xml = documento.gerarXml(identificador);

        return xml + "|imposto:" + String.format("%.2f", imposto);
    }

}