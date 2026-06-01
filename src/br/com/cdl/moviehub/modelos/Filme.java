package br.com.cdl.moviehub.modelos;
public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return getTotalEmMinutos();
    }
}