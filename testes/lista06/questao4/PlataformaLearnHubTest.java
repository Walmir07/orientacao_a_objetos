package lista06.questao4;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class PlataformaLearnHubTest {

    private PlataformaLearnHub plataforma;
    private Curso cursoA;
    private Curso cursoB;
    private Instrutor instrutor;
    private TrilhaDeAprendizado trilha;

    @Before
    public void setUp() {
        plataforma = new PlataformaLearnHub();
        cursoA     = new Curso("Java OOP", "Prof. Ana", 4.8, 99.90);
        cursoB     = new Curso("Python Básico", "Prof. Carlos", 3.5, 49.90);
        instrutor  = new Instrutor("Prof. Ana", "Programação", 4.9);
        trilha     = new TrilhaDeAprendizado("Trilha Backend", 5, 4.6);

        plataforma.cadastrar(cursoA);
        plataforma.cadastrar(cursoB);
        plataforma.cadastrar(instrutor);
        plataforma.cadastrar(trilha);
    }

    // --- listarPorNotaMinima ---

    @Test
    public void listarPorNotaMinimaRetornaCorretos() {
        List<Avaliavel> resultado = plataforma.listarPorNotaMinima(4.6);
        assertEquals(3, resultado.size()); // cursoA, instrutor, trilha
    }

    @Test
    public void listarPorNotaMinimaExcluiAbaixo() {
        List<Avaliavel> resultado = plataforma.listarPorNotaMinima(4.0);
        assertFalse(resultado.contains(cursoB));
    }

    @Test
    public void listarPorNotaMinimaVazioQuandoNenhumAtinge() {
        assertTrue(plataforma.listarPorNotaMinima(5.0).isEmpty());
    }

    // --- listarCompravel ---

    @Test
    public void listarCompravelRetornaSomenteCursos() {
        List<Compravel> resultado = plataforma.listarCompravel();
        assertEquals(2, resultado.size());
        for (Compravel c : resultado) {
            assertTrue(c instanceof Curso);
        }
    }

    @Test
    public void listarCompravelNaoContemInstrutorNemTrilha() {
        List<Compravel> resultado = plataforma.listarCompravel();
        for (Compravel c : resultado) {
            assertFalse(c instanceof Instrutor);
            assertFalse(c instanceof TrilhaDeAprendizado);
        }
    }

    // --- gerarPaginaDeBusca ---

    @Test
    public void gerarPaginaDeBuscaContemResumosDasEntidadesElegiveis() {
        String pagina = plataforma.gerarPaginaDeBusca(4.6);
        assertTrue(pagina.contains(cursoA.gerarResumoPublico()));
        assertTrue(pagina.contains(instrutor.gerarResumoPublico()));
        assertTrue(pagina.contains(trilha.gerarResumoPublico()));
    }

    @Test
    public void gerarPaginaDeBuscaNaoContemEntidadesAbaixoDaNota() {
        String pagina = plataforma.gerarPaginaDeBusca(4.6);
        assertFalse(pagina.contains(cursoB.gerarResumoPublico()));
    }

    // --- processarCompra ---

    @Test
    public void processarCompraRetornaRecibo() {
        String recibo = plataforma.processarCompra("João", "Java OOP");
        assertNotNull(recibo);
        assertTrue(recibo.contains("João"));
    }

    @Test
    public void processarCompraComCursoInexistenteRetornaNullOuVazio() {
        String recibo = plataforma.processarCompra("João", "Curso Inexistente");
        assertTrue(recibo == null || recibo.isEmpty());
    }

    // --- gerarRecibosEmLote ---

    @Test
    public void gerarRecibosEmLoteRetornaUmReciboPorCurso() {
        List<String> recibos = plataforma.gerarRecibosEmLote("Maria");
        assertEquals(2, recibos.size());
    }

    @Test
    public void gerarRecibosEmLoteContemNomeDoComprador() {
        List<String> recibos = plataforma.gerarRecibosEmLote("Maria");
        for (String recibo : recibos) {
            assertTrue(recibo.contains("Maria"));
        }
    }

    // --- interfaces como tipo ---

    @Test
    public void cursoImplementaAvaliavel() {
        assertTrue(cursoA instanceof Avaliavel);
    }

    @Test
    public void cursoImplementaCompravel() {
        assertTrue(cursoA instanceof Compravel);
    }

    @Test
    public void instrutorNaoImplementaCompravel() {
        assertFalse(instrutor instanceof Compravel);
    }

    @Test
    public void trilhaNaoImplementaCompravel() {
        assertFalse(trilha instanceof Compravel);
    }
}