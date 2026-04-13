package lista06.questao3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CatalogoPaginasECiaTest {

    private CatalogoPaginasECia catalogo;

    @Before
    public void setUp() {
        catalogo = new CatalogoPaginasECia();
    }

    // --- equals ---

    @Test
    public void mesmoProdutoNaoEInseridoDuasVezes() {
        LivroFisico l1 = new LivroFisico("Dom Casmurro", "Machado de Assis", 39.90, 256);
        LivroFisico l2 = new LivroFisico("Dom Casmurro", "Machado de Assis", 45.00, 256);
        assertTrue(catalogo.cadastrar(l1));
        assertFalse(catalogo.cadastrar(l2));
        assertEquals(1, catalogo.getProdutos().size());
    }

    @Test
    public void duplicataDetectadaEntretiposDiferentes() {
        LivroFisico livro = new LivroFisico("1984", "George Orwell", 35.00, 328);
        Ebook ebook       = new Ebook("1984", "George Orwell", 19.90, "EPUB");
        assertTrue(catalogo.cadastrar(livro));
        assertFalse(catalogo.cadastrar(ebook));
    }

    @Test
    public void produtoComAutorDiferenteNaoEDuplicata() {
        LivroFisico l1 = new LivroFisico("O Alquimista", "Paulo Coelho", 34.90, 208);
        LivroFisico l2 = new LivroFisico("O Alquimista", "Autor Diferente", 34.90, 208);
        assertTrue(catalogo.cadastrar(l1));
        assertTrue(catalogo.cadastrar(l2));
        assertEquals(2, catalogo.getProdutos().size());
    }

    @Test
    public void produtoComTituloDiferenteNaoEDuplicata() {
        Ebook e1 = new Ebook("Sapiens", "Yuval Noah Harari", 29.90, "PDF");
        Ebook e2 = new Ebook("Homo Deus", "Yuval Noah Harari", 29.90, "PDF");
        assertTrue(catalogo.cadastrar(e1));
        assertTrue(catalogo.cadastrar(e2));
        assertEquals(2, catalogo.getProdutos().size());
    }

    // --- toString e log ---

    @Test
    public void logContemTituloAposInsercao() {
        LivroFisico livro = new LivroFisico("Dom Casmurro", "Machado de Assis", 39.90, 256);
        catalogo.cadastrar(livro);
        assertTrue(catalogo.getLog().get(0).contains("Dom Casmurro"));
    }

    @Test
    public void logContemAutorAposInsercao() {
        Audiobook audio = new Audiobook("Sapiens", "Yuval Noah Harari", 49.90, 720, "Narrador X");
        catalogo.cadastrar(audio);
        assertTrue(catalogo.getLog().get(0).contains("Yuval Noah Harari"));
    }

    @Test
    public void toStringLivroFisicoContemPaginas() {
        LivroFisico livro = new LivroFisico("Dom Casmurro", "Machado de Assis", 39.90, 256);
        catalogo.cadastrar(livro);
        assertTrue(catalogo.getLog().get(0).contains("256"));
    }

    @Test
    public void toStringEbookContemFormato() {
        Ebook ebook = new Ebook("1984", "George Orwell", 19.90, "EPUB");
        catalogo.cadastrar(ebook);
        assertTrue(catalogo.getLog().get(0).contains("EPUB"));
    }

    @Test
    public void toStringAudiobookContemDuracaoENarrador() {
        Audiobook audio = new Audiobook("Sapiens", "Yuval Noah Harari", 49.90, 720, "Narrador X");
        catalogo.cadastrar(audio);
        String entrada = catalogo.getLog().get(0);
        assertTrue(entrada.contains("720"));
        assertTrue(entrada.contains("Narrador X"));
    }

    @Test
    public void logNaoRegistraDuplicata() {
        LivroFisico livro = new LivroFisico("Dom Casmurro", "Machado de Assis", 39.90, 256);
        catalogo.cadastrar(livro);
        catalogo.cadastrar(livro);
        assertEquals(1, catalogo.getLog().size());
    }
}