package aula5.br.edu.ifpb.suap;

import aula5.br.edu.ifpb.suap.model.Estudante;
import aula5.br.edu.ifpb.suap.model.Disciplina;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estudante est1 = new Estudante();

        try {
            est1.setCpf("123345678910");
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Disciplina> disciplinas = new ArrayList<>();

        for (Disciplina d : disciplinas) {
            System.out.println(d.nome);
        }

        // Crie um programa que leia os dados de um estudante (Nome e CPF)
        // O programa deve sempre pedir ao usuário para digitar
        // novamente o CPF caso o valor digitado seja inválido

        // Digite seu nome: antonio
        // Digite seu CPF: 123
        // CPF deve ter 11 dígitos.
        // Digite seu CPF: 1234
        // CPF deve ter 11 dígitos.
        // Digite seu CPF: 12312312312
        // Cadastro concluido para:
        // Nome: antonio
        // CPF: 12312312312

        Estudante estudante = new Estudante();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        while(true){

            System.out.print("Digite seu CPF: ");
            String cpf = sc.nextLine();

            try {
                estudante.setCpf(cpf);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        sc.close();

    }
}