package lista06.questao4;

import java.util.ArrayList;
import java.util.List;

public class PlataformaLearnHub {

    private List<Avaliavel> avaliaveis = new ArrayList<>();
    private List<Compravel> compraveis = new ArrayList<>();

    void cadastrar(Avaliavel a){
        avaliaveis.add(a);
    }

    List<Avaliavel> listarPorNotaMinima(double notaMinima){

        List<Avaliavel> listaNotasMinimas = new ArrayList<>();

        for(Avaliavel aval : avaliaveis){
            if(aval.getNotaMedia() >= notaMinima){
                listaNotasMinimas.add(aval);
            }
        }

        return listaNotasMinimas;
    }

    List<Compravel> listarCompravel(){

        List<Curso> cursosCompraveis = new ArrayList<>();

        for(Compravel compravel : compraveis){
            Curso cursoCompravel = (Curso) compravel;
            cursosCompraveis.add(cursoCompravel);
        }

        return compraveis;
    }

    String gerarPaginaDeBusca(double notaMinima){
        StringBuilder resultado = new StringBuilder();
        for(Avaliavel a : avaliaveis){
            if(a.getNotaMedia() >= notaMinima){
                resultado.append(a.gerarResumoPublico() + "\n");
            }
        }
        return resultado.toString();
    }

    String processarCompra(String nomeComprador, String tituloCurso){
        
        Curso curso = null;
        
        for(Compravel compravel : compraveis){
            if( ((Curso) compravel).getTitulo().equals(tituloCurso)){
                curso = (Curso) compravel;
            }
        }
        
        if(curso != null){
            return curso.gerarRecebido(nomeComprador);
        }
        
        return null;
        
    }

    //Finalizar essa parte:

    List<String> gerarRecibosEmLote(String nomeComprador) {

        List<String> resultados = new ArrayList<>();

        for(Compravel c : compraveis){
            Curso curso = (Curso) c;
            resultados.add(curso.gerarRecebido(nomeComprador));
        }

        return resultados;

    }
}
