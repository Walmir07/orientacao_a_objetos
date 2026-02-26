package aula4;

public class Relogio {

    int horas;
    int minutos;
    int segundos;

    public Relogio(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void tick(){

        segundos++;

        if(segundos >= 60){
            segundos = 0;
            minutos++;
        }

        if(minutos >= 60){
            minutos = 0;
            horas++;
        }

        if(horas >= 24){
            segundos = 0;
            minutos = 0;
            horas = 0;
        }

    }

    public void adicionarSegundos(int n){
        for(int i = 0; i < n; i++){
            this.tick();
        }
    }

    public void exibirHorario(){
        System.out.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public boolean isMaiorQue(Relogio outro){

        int horasRelogioAtual = horas * 3600 + minutos * 60 + segundos;
        int horasOutroRelogio = outro.horas * 3600 + outro.minutos * 60 + outro.segundos;

        if(horasRelogioAtual > horasOutroRelogio){
            return true;
        } else {
            return false;
        }

    }

}
