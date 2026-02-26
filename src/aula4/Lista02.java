package aula4;

public class Lista02 {

    public static void main(String[] args) {

        // Questão 1:

        // Máximos e mínimos:

        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        // Overflow e underflow:

        //Em byte:

        byte overflowByte = (byte) (maxByte + 1);
        System.out.println("Máximo byte + 1: " + overflowByte);
        // Resulta em -128 por exceder o limite de byte que é 127, tornando-se o negativo mais baixo.

        byte underflowByte = (byte) (minByte - 1);
        System.out.println("Mínimo byte - 1: " + underflowByte);
        // Resulta em 127 por exceder o limite mínimo de byte que é -128, tornando-se o positivo mais alto.

        //Em short:

        short overflowShort = (short) (maxShort + 1);
        System.out.println("Máximo short + 1: " + overflowShort);
        // Resulta em -32768 por exceder o limite de short que é 32767, tornando-se o negativo mais baixo.

        short underflowShort = (short) (minShort - 1);
        System.out.println("Mínimo short - 1: " + underflowShort);
        // Resulta em 32767 por exceder o limite mínimo de short que é -32768, tornando-se o positivo mais alto.

        // Em int:

        int overflowInt = (int) (maxInt + 1);
        System.out.println("Máximo int + 1: " + overflowInt);
        // Resulta em -2147483648 por exceder o limite de byte que é 2147483647, tornando-se o negativo mais baixo.

        int underflowInt = (int) (minInt - 1);
        System.out.println("Mínimo byte - 1: " + underflowInt);
        // Resulta em 2147483647 por exceder o limite mínimo de byte que é -2147483648, tornando-se o positivo mais alto.

        // Long para byte:

        long numLong = 300L;
        byte longParaByte = (byte) numLong;

        System.out.println(longParaByte); // 44
        // Um long 300 para byte resulta em 44 pois é o máximo que um byte pode ocupar de um long;

        // Questão 3:

        Temperatura tempCelsius = new Temperatura(36, "C");
        Temperatura tempFahrenheit = new Temperatura(36, "F");
        Temperatura tempKelvin = new Temperatura(36, "K");

        //Converções para cesius:
        System.out.println(tempCelsius.toFahrenheit());
        System.out.println(tempCelsius.toKelvin());

        //Converções para fehrenheit:
        System.out.println(tempFahrenheit.toCelsius());
        System.out.println(tempFahrenheit.toKelvin());

        //Converções para kelvin:
        System.out.println(tempKelvin.toCelsius());
        System.out.println(tempKelvin.toFahrenheit());

        //Impressões com escala:
        tempCelsius.imprimeComEscala();
        tempFahrenheit.imprimeComEscala();
        tempKelvin.imprimeComEscala();

        // Questão 4:

        Estudante estudante = new Estudante("Lucas", 12345, 100, 100, 90, 88);
        estudante.setNotas(100, 100, 100, 100);
        System.out.println(estudante.getMedia());
        System.out.println(estudante.getSituacao());
        System.out.println(estudante.getNota(2));

        Estudante estudante2 = new Estudante("Matheus", 12345, 50, 50, 50, 60);
        estudante2.setNotas(50, 60, 40, 65);
        System.out.println(estudante2.getMedia());
        System.out.println(estudante2.getSituacao());
        System.out.println(estudante2.getNota(2));

        Estudante estudante3 = new Estudante("João", 12345, 10, 20, 30, 10);
        estudante3.setNotas(10, 30, 20, 15);
        System.out.println(estudante3.getMedia());
        System.out.println(estudante3.getSituacao());
        System.out.println(estudante3.getNota(2));

        /*for(double nota : estudante2.notas){
            System.out.println(nota);
        }*/

        // Questão 5:

        System.out.println("###############################\n");

        //Conta 1:
        ContaCorrente conta1 = new ContaCorrente();
        conta1.titular = "Walmir";
        conta1.numeroConta = 102030;
        conta1.saldo = 3000.0;

        //Conta 2:

        ContaCorrente conta2 = new ContaCorrente();
        conta2.titular = "Maria";
        conta2.numeroConta = 405060;
        conta2.saldo = 4000.0;

        //Ações:

        System.out.println("\nAções:");

        conta1.depositar(500);
        System.out.println(conta1.saldo);
        conta1.sacar(1000);
        System.out.println(conta1.saldo);

        conta2.depositar(1000);
        System.out.println(conta2.saldo);
        conta2.sacar(500);
        System.out.println(conta2.saldo);

        //Transferências:

        System.out.println("\nTransferências:");

        conta1.transferir(conta2, 1000);
        conta1.transferir(conta2, 2000);

        System.out.println("saldo conta1: " + conta1.saldo);
        System.out.println("saldo conta1: " + conta2.saldo);

        //Dados:

        System.out.println("Dados:");

        conta1.getSaldo();
        conta2.getSaldo();

        // Questão 6:

        System.out.println("\nCículo 1: ");
        Circulo circulo1 = new Circulo();
        circulo1.raio = 5.0;
        circulo1.exibirDados();

        circulo1.raio = circulo1.raio * 2;
        circulo1.exibirDados();

        System.out.println("\nCículo 2: ");
        Circulo circulo2 = new Circulo();
        circulo2.raio = 3.0;
        circulo2.exibirDados();

        System.out.println("\nMaior: ");
        System.out.println(circulo1.maior(circulo2));
        System.out.println(circulo2.maior(circulo1));

        System.out.println("\nContém outro: ");
        System.out.println(circulo1.contemOutro(circulo2)); //True: Contém o cículo 2
        System.out.println(circulo2.contemOutro(circulo1)); //True: Não contém o cículo 1

        // Questão 7: Finalizar testes.

        System.out.println("\nRelógio: ");

        Relogio relogio1 = new Relogio(23, 59, 58);

        System.out.println(relogio1.horas);
        System.out.println(relogio1.minutos);
        System.out.println(relogio1.segundos);

        System.out.println("Testes");

        relogio1.tick();
        relogio1.tick();
        relogio1.tick();
        relogio1.tick();

        relogio1.adicionarSegundos(3600);

        System.out.println(relogio1.horas);
        System.out.println(relogio1.minutos);
        System.out.println(relogio1.segundos);

        relogio1.exibirHorario();

        Relogio relogio2 = new Relogio(02, 00, 03);

        System.out.println(relogio1.isMaiorQue(relogio2));

        System.out.println(relogio2.isMaiorQue(relogio1));

    }

}
