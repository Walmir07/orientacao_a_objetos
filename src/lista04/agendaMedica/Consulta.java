package lista04.agendaMedica;

public class Consulta {

    public int id;
    public String nomePaciente;
    public String nomeMedico;
    public String dataHora;
    public String status;
    public String observacoes;

    public Consulta(int id, String nomePaciente, String nomeMedico, String dataHora, String status){

        if(nomePaciente == null || nomeMedico == null || dataHora == null){
            throw new IllegalArgumentException();
        }

        if(nomePaciente.isBlank() || nomeMedico.isBlank() || dataHora.isBlank() || id <= 0){
            throw new IllegalArgumentException();
        }

        this.id = id;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.dataHora = dataHora;
        this.status = "AGENDADA";
        this.observacoes = "";
    }

    public int getId() {
        return id;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public String getDataHora() {
        return dataHora;
    }

    public String getStatus() {
        return status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void confirmar(){
        if(status.equals("AGENDADA")){
            this.status = "CONFIRMADA";
        }
    }

    public void cancelar() {
        if (status.equals("AGENDADA") || status.equals("CONFIRMADA")){
            status = "CANCELADA";
        }
    }

    public void realizar() {
        if (status.equals("CONFIRMADA")){
            status = "REALIZADA";
        }
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}




