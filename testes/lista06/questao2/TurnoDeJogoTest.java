package lista06.questao2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TurnoDeJogoTest {

    private Guerreiro guerreiro;
    private Mago mago;
    private Arqueiro arqueiro;
    private Personagem alvo;

    @Before
    public void setUp() {
        guerreiro = new Guerreiro("Thorin", 100, 30);
        mago      = new Mago("Gandalf", 80, 50, 20, 60);
        arqueiro  = new Arqueiro("Legolas", 90, 25, 3);
        alvo      = new Guerreiro("Inimigo", 200, 0);
    }

    @Test
    public void guerreiroInfligeDano() {
        guerreiro.executarAtaque(alvo);
        assertEquals(170, alvo.getPontosDeVida());
    }

    @Test
    public void magoInfligeDanoEConsomeMana() {
        mago.executarAtaque(alvo);
        assertEquals(150, alvo.getPontosDeVida());
        assertEquals(40, mago.getManaAtual());
    }

    @Test
    public void magoSemManaNaoCausaDano() {
        Mago magoSemMana = new Mago("Fraco", 50, 50, 30, 10);
        magoSemMana.executarAtaque(alvo);
        assertEquals(200, alvo.getPontosDeVida());
    }

    @Test
    public void arqueiroInfligeDanoEConsomeFlecha() {
        arqueiro.executarAtaque(alvo);
        assertEquals(175, alvo.getPontosDeVida());
        assertEquals(2, arqueiro.getFlechasRestantes());
    }

    @Test
    public void arqueiroSemFlechasNaoCausaDano() {
        Arqueiro semFlechas = new Arqueiro("Vazio", 80, 20, 0);
        semFlechas.executarAtaque(alvo);
        assertEquals(200, alvo.getPontosDeVida());
    }

    @Test
    public void vidaNaoFicaNegativa() {
        Guerreiro tanque = new Guerreiro("Brutus", 100, 999);
        Personagem fraco = new Arqueiro("Frágil", 10, 5, 1);
        tanque.executarAtaque(fraco);
        assertEquals(0, fraco.getPontosDeVida());
    }

    @Test
    public void turnoPolimorficoAtacaAlvoCorretamente() {
        TurnoDeJogo turno = new TurnoDeJogo();
        turno.adicionarPersonagem(guerreiro);
        turno.adicionarPersonagem(mago);
        turno.adicionarPersonagem(arqueiro);
        turno.executarTurno(alvo);
        assertEquals(95, alvo.getPontosDeVida()); // 200 - 30 - 50 - 25
    }

    @Test
    public void contarVivosAposAlvoMorrer() {
        TurnoDeJogo turno = new TurnoDeJogo();
        Personagem fraco = new Arqueiro("Frágil", 5, 3, 1);
        turno.adicionarPersonagem(fraco);
        turno.adicionarPersonagem(guerreiro);
        assertEquals(2, turno.contarVivos());
        guerreiro.executarAtaque(fraco);
        assertEquals(1, turno.contarVivos());
    }

    @Test
    public void getClasseRetornaCorreto() {
        assertEquals("Guerreiro", guerreiro.getClasse());
        assertEquals("Mago", mago.getClasse());
        assertEquals("Arqueiro", arqueiro.getClasse());
    }

    @Test
    public void personagemMortoNaoAtacaNoTurno() {
        TurnoDeJogo turno = new TurnoDeJogo();
        Personagem morto = new Guerreiro("Morto", 0, 50);
        turno.adicionarPersonagem(morto);
        turno.executarTurno(alvo);
        assertEquals(200, alvo.getPontosDeVida());
    }
}