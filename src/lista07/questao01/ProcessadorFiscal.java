package lista07.questao01;

public class ProcessadorFiscal {

    public String processar(String tipo, double valor, String identificador) {
        double imposto;
        String xml;

        switch (tipo) {
            case "NFE":
                imposto = valor * 0.18;
                xml = "<nfe>" + identificador + "</nfe>";
                break;
            case "CTE":
                imposto = valor * 0.12;
                xml = "<cte>" + identificador + "</cte>";
                break;
            case "NFSE":
                imposto = valor * 0.05;
                xml = "<nfse>" + identificador + "</nfse>";
                break;
            case "MDFE":
                imposto = valor * 0.08;
                xml = "<mdfe>" + identificador + "</mdfe>";
                break;
            default:
                throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        }

        return xml + "|imposto:" + String.format("%.2f", imposto);
    }
}