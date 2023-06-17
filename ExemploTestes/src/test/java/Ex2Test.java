import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ex2Test {
    private Serie serie;

    @BeforeEach
    public void setup() {
        serie = new Serie("serie", "terror");
    }

    @Test
    public void testMediaDuracaoSemEpisodios() {
        double mediaDuracao = serie.calcularMediaDuracaoEpisodios();
        assertEquals(0.0, mediaDuracao, 0);
    }

    @Test
    public void testMediaDuracaoEpisodiosComEpisodios() {
        Episodio episode1 = new Episodio("episodio1", 10);
        Episodio episode2 = new Episodio("episodio2", 40);

        serie.getTemporada1().add(episode1);
        serie.getTemporada2().add(episode2);

        double mediaDuracao = serie.calcularMediaDuracaoEpisodios();
        assertEquals(25.0, mediaDuracao, 0.0001);
    }

    @Test
    public void testGetNumeroEpisodiosSemEpisodios() {
        int numeroEpisodios = serie.getNumeroEpisodios();
        assertEquals(0, numeroEpisodios);
    }

    @Test
    public void testGetNumeroEpisodiosComEpisodios() {
        Episodio episode1 = new Episodio("episodio1", 10);
        Episodio episode2 = new Episodio("episodio2", 20);
        Episodio episode3 = new Episodio("episodio3", 30);
        Episodio episode4 = new Episodio("episodio4", 40);

        serie.getTemporada1().add(episode1);
        serie.getTemporada2().add(episode2);
        serie.getTemporada3().add(episode3);
        serie.getTemporada4().add(episode4);

        int numeroEpisodios = serie.getNumeroEpisodios();
        assertEquals(4, numeroEpisodios);
    }

    @Test
    public void testMediaDuracaoEpisodiosSeriesDiferentes() {
        Episodio episodio1 = new Episodio("Episodio1", 30);
        Episodio episodio2 = new Episodio("Episodio2", 40);
        Episodio episodio3 = new Episodio("Episodio3", 50);

        serie.getTemporada1().add(episodio1);
        serie.getTemporada1().add(episodio2);
        serie.getTemporada2().add(episodio3);

        double mediaDuracao = serie.calcularMediaDuracaoEpisodios();
        assertEquals(40.0, mediaDuracao, 0.0001);
    }

    @Test
    public void testNumeroEpisodiosComEpisodiosSeriesDiferentes() {
        Episodio episodio1 = new Episodio("Episodio1", 30);
        Episodio episodio2 = new Episodio("Episodio2", 40);
        Episodio episodio3 = new Episodio("Episodio3", 50);

        serie.getTemporada1().add(episodio1);
        serie.getTemporada1().add(episodio2);
        serie.getTemporada2().add(episodio3);

        int numeroEpisodios = serie.getNumeroEpisodios();
        assertEquals(3, numeroEpisodios);
    }
}

