package aula1;

public class PrimeiroPrograma {

    // main: principal método da classe. Vai executar quando você rodar a aplicação
    // ou, simplesmente, rodar a classe.

    public static void main(String[] args) {

        boolean isValid = true;
        byte z = 1;
        short y = -32768;
        int x = 10;
        long w = 16; // 64 bits
        double d = 3.14; // 64 bits
        float f = 3.14f; // 32 bits
        char ch = 64; // 8 bits

        String str = "abcd";

        if (x > 15) {
            System.out.println("x é maior que 15");
        } else if (x < 10) {
            System.out.println("x é menor que 10");
        } else {

        }

        System.out.println("Fora do if...");

        // 15 - 40
        // Sensor - 1000 valores
        // bytes -> 1000 bytes (1 KB)
        // long -> 1000 * 8 bytes (8 KB)

        // Tudo em Java é orientado a objetos.
        // System é uma classe que tem o atributo out, que tem o método println()

        System.out.println("Olá, mundo!");
    }
}
