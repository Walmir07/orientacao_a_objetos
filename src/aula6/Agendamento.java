package aula6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agendamento {

    private String nomeCliente;
    private String servico;
    private LocalDateTime data;

    public Agendamento() {
        this("Cliente indefinido");
    }

    public Agendamento(String nomeCliente) {
        this(nomeCliente, null, LocalDateTime.now());
    }

    public Agendamento(String nomeCliente, String servico, LocalDateTime data) {
        this.nomeCliente = nomeCliente;
        this.servico = servico;
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
        return String.format("Cliente: %s, Serviço: %s, Data: %s",
                nomeCliente, servico, df.format(data));
    }

    public static void main(String[] args){

        Agendamento a1 = new Agendamento();
        Agendamento a2 = new Agendamento("Antonio");
        Agendamento a3 = new Agendamento("Antonio", "Balanceamento", LocalDateTime.of(2026, 4, 6, 0, 0));

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }

}
