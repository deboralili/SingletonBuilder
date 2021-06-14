import java.util.List;

public class FilmeBuilder {
    private Filme filme;

    public FilmeBuilder() {
        filme = new Filme();
    }

    public Filme build(){
        if (filme.getId() == "") {
            throw new IllegalArgumentException("Id inválido");
        }
        if (filme.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return filme;
    }

    public FilmeBuilder setNome(String nome) {
        filme.setNome(nome);
        return this;
    }

    public FilmeBuilder setId(String id) {
        filme.setId(id);
        return this;
    }

    public FilmeBuilder setLancamento(String lancamento) {
        filme.setLancamento(lancamento);
        return this;
    }

    public FilmeBuilder setSinopse(String sinopse) {
        filme.setSinopse(sinopse);
        return this;
    }

    public FilmeBuilder setDuracao(String duracao) {
        filme.setDuracao(duracao);
        return this;
    }

    public FilmeBuilder setNacionalidade(String nacionalidade) {
        filme.setNacionalidade(nacionalidade);
        return this;
    }

    public FilmeBuilder setDiretor(List<String> diretor) {
        filme.setDiretor(diretor);
        return this;
    }

    public FilmeBuilder setElenco(List<String> elenco) {
        filme.setElenco(elenco);
        return this;
    }

}
