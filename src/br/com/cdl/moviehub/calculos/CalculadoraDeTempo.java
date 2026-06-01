package br.com.cdl.moviehub.calculos;

import br.com.cdl.moviehub.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

     //método para calcular o tempo de um filme
//    public void inclui(Filme f) {
//        this.tempoTotal += f.getTotalEmMinutos();
//    }

    //método para calcular o tempo de uma série
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getTemporadas() * s.getEpisodiosPorTemporada() * s.getMinutosPorEpisodio();
//    }

public void inclui(Titulo titulo) {
    System.out.println("Adicionando duracao em minutos de " + titulo);
    this.tempoTotal += titulo.getDuracaoEmMinutos();
}


}
