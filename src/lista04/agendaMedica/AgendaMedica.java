package lista04.agendaMedica;

import java.util.ArrayList;
import java.util.List;

public class AgendaMedica {

    public List<Consulta> consultas;

    public void agendar(Consulta c){
        if(c == null){
            throw new IllegalArgumentException();
        } else {
            consultas.add(c);
        }
    }

    public Consulta buscarPorId(int id){
        for(Consulta c : consultas){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }

    public List<Consulta> listarPorMedico(String nomeMedico){

        List<Consulta> listaFiltrada = new ArrayList<>();

        for(Consulta consulta : consultas){
            if(consulta.getNomeMedico() == nomeMedico){
                listaFiltrada.add(consulta);
            }
        }

        return listaFiltrada;
    }

    public List<Consulta> listarAtivas() {
        List<Consulta> listaAtivas = new ArrayList<>();

        for (Consulta c : consultas){
            if (c.getStatus().equals("AGENDADA") || c.getStatus().equals("CONFIRMADA")){
                listaAtivas.add(c);
            }
        }

        return listaAtivas;
    }

}
