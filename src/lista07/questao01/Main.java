package lista07.questao01;

public class Main {
    public static void main(String[] args){

        ProcessadorFiscal processador = new ProcessadorFiscal();

        System.out.println(processador.processar("NFE", 10.0, "FN1"));
        System.out.println(processador.processar("CTE", 10.0, "FC1"));
        System.out.println(processador.processar("NFSE", 10.0, "FT1"));
        System.out.println(processador.processar("MDFE", 10.0, "FM1"));

    }
}
