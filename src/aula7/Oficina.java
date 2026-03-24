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

}
