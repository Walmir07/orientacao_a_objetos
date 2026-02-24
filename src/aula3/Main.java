package aula3;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Código inicial

        int valor = 0;

        for (int i = 1; i < 5; i++) {
            valor += i;
        }

        System.out.println(valor);

        // Wrapper classes

        // lista = []
        // lista.append(2)
        // lista[3] = 2

        int[] numeros = {1, 3, 5, 6, 8};

        ArrayList<Integer> numeros2;

        // BigDecimal - Números com mais precisão

        BigDecimal val = new BigDecimal("4.50");

        BigDecimal val2 = val.multiply(val);

        float num = 0.1f;
        float soma = 0;

        for (int i = 0; i < 10; i++){
            soma *= num;
        }

        System.out.println(soma);

        // Criação de objetos:

        Produto arroz = new Produto("Feijão", 5.00, 600, LocalDateTime.of(2027, 12, 5, 10, 10));

        arroz.nome = "Arroz";
        arroz.quantidade = 500;
        arroz.validade = LocalDateTime.of(2027, 12, 5, 10, 10);

        System.out.println(arroz.nome);
        System.out.println(arroz.quantidade);
        System.out.println(arroz.validade);

        System.out.println("O estoque do produto " + arroz.nome + " tem o estoque de R$" + arroz.valorEmEstoque());
        System.out.println("E a validade em " + arroz.getValidade());

        System.out.println("Preço sem desconto: R$" + arroz.preco + " / Preço com desconto de 40%: R$ " + arroz.calcularPreco(0.4));

    }
}