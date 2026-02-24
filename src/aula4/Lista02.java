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

        Temperatura temp = new Temperatura(32, "C");
        Temperatura temp2 = new Temperatura(67, "F");
        Temperatura temp3 = new Temperatura(24, "K");

        //Tetes

        System.out.println(temp.toCelsius());
        System.out.println(temp2.toCelsius());
        System.out.println(temp3.toCelsius());

        System.out.println(temp.toFahrenheit());
        System.out.println(temp2.toFahrenheit());
        System.out.println(temp3.toCelsius());

        System.out.println(temp.toKelvin());
        System.out.println(temp2.toKelvin());
        System.out.println(temp3.toCelsius());

        temp.imprimeComEscala();
        temp2.imprimeComEscala();
        temp3.imprimeComEscala();

    }

}
