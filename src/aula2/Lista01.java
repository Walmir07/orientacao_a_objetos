package aula2;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Lista01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Questão: ");
        int q = sc.nextInt();

        switch (q) {
            case 1 -> questao1();
            case 2 -> questao2();
            case 3 -> questao3();
            case 4 -> questao4();
            case 5 -> questao5();
            case 6 -> questao6();
            case 7 -> questao7();
            case 8 -> questao8();
            case 9 -> questao9();
            case 10 -> questao10();
            case 11 -> questao11();
            case 12 -> questao12();
            case 13 -> questao13();
            case 14 -> questao14();
            case 15 -> questao15();
            case 16 -> questao16();
            default -> System.out.println("Questão inválida");
        }
    }

    // Questões
    // Desenvolva cada questão dentro dos métodos a seguir
    static void questao1() {

        int idade = 17;

        if(idade >= 18){
            System.out.println("Maior.");
        } else {
            System.out.println("Menor.");
        }

    }

    static void questao2() {

        int numero = 16;

        if(numero % 2 == 0){
            System.out.println("É par.");
        } else {
            System.out.println("É ímpar.");
        }

    }

    static void questao3() {

        int x = 2;
        int y = 7;

        if(x > y){
            System.out.println(x + " é maior.");
        } else if(y > x) {
            System.out.println(y + " é maior.");
        } else {
            System.out.println("Os números são iguais.");
        }

    }

    static void questao4() {

        int temperatura = 31;

        if(temperatura < 20){
            System.out.println("Está frio.");
        } else {
            System.out.println("Está quente.");
        }

    }

    static void questao5() {

        double notaAluno = 6.5;

        if(notaAluno >= 6.8){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado.");
        }

    }

    static void questao6() {

        double consumo = 33.5;
        double total;

        if(consumo <= 100){
            total = consumo * 0.50;
        } else {
            total = consumo * 0.70;
        }

        System.out.println("O valor total é: R$ " + total);

    }

    static void questao7() {

        for(int i = 10; i >= 0; i--){
            System.out.println("Contagem regressiva: " + i);
        }

    }

    static void questao8() {

        int i = 0;
        int soma = 0;

        while(i <= 100){
            if(i % 2 == 0){
                soma += i;
            }

            i++;
        }

        System.out.println("A soma dos pares entre 1 e 100 é: " + soma);

    }

    static void questao9() {

        int numero = 9;

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }

    static void questao10() {

        int numero = 7;
        boolean ePrimo = true;

        if(numero <= 1 ){

            ePrimo = false;

        } else {

            for(int i = 2; i <= numero / 2; i++){
                if(numero % i == 0){
                    ePrimo = false;
                    break;
                }
            }

        }

        if(ePrimo){
            System.out.println("O número " + numero + " é primo");
        } else {
            System.out.println("O número " + numero + " não é primo");
        }


    }

    static void questao11() {

        String letra = "B";

        String novaLetra = letra.toLowerCase();

        switch (novaLetra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("É vogal");
                break;
            default:
                System.out.println("É consoante");
                break;
        }

    }

    static void questao12() {

        char palavra = 'a';
        String frase = "Java é bom";
        int quantidade = 0;

        String frasePadronizada = frase.toLowerCase();

        for(int i = 0; i < frasePadronizada.length(); i++){
            if(frasePadronizada.charAt(i) == palavra){
                quantidade++;
            }
        }

        System.out.println("A frase possui " + quantidade + " letras 'a'.");

    }

    static void questao13() {

        int[] interos = {2, 4, 6, 8, 12};

        int numeroBuscado = 1;

        for(int i = 0; i < interos.length; i++){
            if(interos[i] == numeroBuscado){
                System.out.println("O número " + numeroBuscado + " está presente no Array.");
                break;
            }
        }

    }

    static void questao14() {

        double[] notas = {9.0, 7.5, 10, 6.5, 8.0};
        double soma = 0;

        for(double nota : notas){
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("A média das notas é: " + media);

    }

    static void questao15() {

        String[] frutas = {"Abacate", "Maça", "Banana", "Morango"};

        for(int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }

    }

    static void questao16() {

        String[] frutas = {"Abacate", "Maça", "Banana", "Morango"};

        for(int i = 0; i < frutas.length; i++){
            if(frutas[i].charAt(0) == 'M'){
                System.out.println(frutas[i]);
            }
        }

    }
}
