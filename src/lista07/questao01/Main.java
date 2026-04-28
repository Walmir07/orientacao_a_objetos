package lista07.questao01;

public class Main {
    public static void main(String[] args) {

        DocumentoFiscal documentoNFE = new NFE();
        DocumentoFiscal documentoCTE = new CTE();
        DocumentoFiscal documentoNFSE = new NFSE();
        DocumentoFiscal documentoMDFE = new MDFE();

        ProcessadorFiscal processador = new ProcessadorFiscal();

        System.out.println(processador.processar(documentoNFE, 80.0, "NFE2"));
        System.out.println(processador.processar(documentoCTE, 80.0, "CTE2"));
        System.out.println(processador.processar(documentoNFSE, 80.0, "NFSE2"));
        System.out.println(processador.processar(documentoMDFE, 80.0, "MDFE2"));

    }
}
