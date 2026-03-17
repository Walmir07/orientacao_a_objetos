package lista04.agendaMedica;

public class Consulta {

    public int id;
    public String nomePaciente;
    public String nomeMedico;
    public String dataHora;
    public String status;
    public String observacoes;

    public Consulta(int id, String nomePaciente, String nomeMedico, String dataHora, String status){
        this.id = id;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.dataHora = dataHora;
        this.status = "AGENDADO";
        this.observacoes = "";
    }



}
