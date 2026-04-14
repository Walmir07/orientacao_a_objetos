package lista06.questao2;

import java.util.ArrayList;
import java.util.List;

public class TurnoDeJogo {

    private List<Personagem> personagens;

    public TurnoDeJogo(){
        this.personagens = new ArrayList<>();
    }

    void adicionarPersonagem(Personagem p){
        personagens.add(p);
    }

    void executarTurno(Personagem alvo){
        for(Personagem personagem : personagens){
            if(personagem.estaVivo()){
                personagem.executarAtaque(alvo);
            }
        }
    }

    int contarVivos(){
        int totalVivos = 0;
        for (Personagem personagem : personagens){
            if(personagem.estaVivo()){
                totalVivos++;
            }
        }
        return totalVivos;
    }

}
