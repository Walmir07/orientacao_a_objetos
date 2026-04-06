package aula7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Oficina {

    private List<Agendamento> agendamentos = new ArrayList<Agendamento>();

    public void adicionar(Agendamento a){
        agendamentos.add(a);
    }

    public List<Agendamento> getAgendamentos(){
        return Collections.unmodifiableList(this.agendamentos);
    }

    public double calcularFaturamento(){
        double total = 0;

        for(Agendamento a : agendamentos){
            total += a.custoTotal();
        }

        return total;
    }

    public void gerarRelatorio() {

        for(Agendamento agendamento : agendamentos){
            System.out.println("Oficina{" +
                                    "\n\tNome do cliente = " + agendamento.getCliente().getNome() +
                                    "\n\tTipo de agendamento = " + agendamento.getClass().getSimpleName() +
                                    "\n\tCusto calculado = " + agendamento.custoTotal() + "\n}");
        }

    }
}
