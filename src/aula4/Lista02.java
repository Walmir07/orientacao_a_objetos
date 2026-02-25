package aula4;

import java.util.Arrays;

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

    }

}
