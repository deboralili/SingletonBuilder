import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeBuilderTest {

    @Test
    void deveRetornarExcecaoParaFilmeSemId() {
        try {
            FilmeBuilder filmeBuilder = new FilmeBuilder();
            Filme filme = filmeBuilder
                    .setNome("O Conde de Monte Cristo")
                    .setLancamento("25 de janeiro de 2002")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Id inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFilmeSemNome() {
        try {
            FilmeBuilder filmeBuilder = new FilmeBuilder();
            Filme filme = filmeBuilder
                    .setId("000001")
                    .setLancamento("25 de janeiro de 2002")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarFilmeValido() {
        FilmeBuilder filmeBuilder = new FilmeBuilder();
        Filme filme = filmeBuilder
                .setId("000001")
                .setNome("O Conde de Monte Cristo")
                .setLancamento("25 de janeiro de 2002")
                .build();

        assertNotNull(filme);
    }
}