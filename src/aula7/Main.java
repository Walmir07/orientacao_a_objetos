package aula7;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João", "8399998888");
        Cliente cliente2 = new Cliente("Maria", "8399887766");
        Cliente cliente3 = new Cliente("Pedro", "8399665544");


        Veiculo veiculo1 = new Veiculo("ABC1234", "Chevrolet Onix", 2023);
        Veiculo veiculo2 = new Veiculo("XYZ2345", "BYD Dolphin", 2024);

        Servico servico1 = new Servico("Troca de óleo", 150.00);
        Servico servico2 = new Servico("Fazer o motor", 2500.00);
        Servico servico3 = new Servico("Alinhamento e balanceamento", 250.00);

        Agendamento agendamento1 = new Agendamento(cliente1, veiculo1, "PESADO");
        agendamento1.addServico(servico1); // 150.

        Agendamento agendamento2 = new Agendamento(cliente1, veiculo2, "LEVE");
        agendamento2.addServico(servico2);
        agendamento2.addServico(servico3);

        Oficina oficina = new Oficina();
        oficina.adicionar(agendamento1);
        oficina.adicionar(agendamento2);

        for (Agendamento a : oficina.getAgendamentos()) {
            System.out.println(a);
        }

        //Crie um método que calcule o custo total se um agendamento.

        System.out.println(agendamento1.custoTotal());
        System.out.println(agendamento2.custoTotal());

        System.out.println(oficina.calcularFaturamento());

        // Teste de classes herdadas:
        System.out.println("########### Agendamento urgente ##########");

        //Classe de agendamento normal 1.
        Agendamento agendamentoNormal1 = new Agendamento(cliente1, veiculo1, "PESADO");
        agendamentoNormal1.addServico(servico1); // 150.
        System.out.println(agendamentoNormal1.custoTotal()); //195.

        //Classe de agendamento urgente (Possui taxa de urgência).
        Agendamento agendamentoUrgente1 = new AgendamentoUrgente(cliente2, veiculo1, "PESADO", 100);
        agendamentoUrgente1.addServico(servico1); // 150.
        System.out.println(agendamentoUrgente1.custoTotal()); //295.

        // Teste de classes herdadas:
        System.out.println("########### Agendamento retorno ##########");

        //Classe de agendamento normal 2.
        Agendamento agendamentoNormal2 = new Agendamento(cliente1, veiculo1, "PESADO");
        agendamentoNormal2.addServico(servico1); // 150.
        System.out.println(agendamentoNormal2.custoTotal()); //195.

        //Classe de agendamento retorno (Possui desconto de retorno).
        Agendamento agendamentoRetorno1 = new AgendamentoRetorno(cliente3, veiculo1, "PESADO");
        agendamentoRetorno1.addServico(servico1); // 150.
        System.out.println(agendamentoRetorno1.custoTotal()); //165.75.

        //Testes de geração de relatório em oficina:

        //Oficina urgente:
        oficina.adicionar(agendamentoNormal1);
        oficina.adicionar(agendamentoUrgente1);
        oficina.adicionar(agendamentoRetorno1);

        //Geração de relatórios:
        oficina.gerarRelatorio();
    }

}
