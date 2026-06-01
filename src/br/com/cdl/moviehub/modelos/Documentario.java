package br.com.cdl.moviehub.modelos;

public class Documentario extends Titulo {
    private String tema;
    private boolean premiado;

    // Sobrescrita para exibir a ficha customizada e limpa do Documentário
    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome do documentário: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Tema: " + this.tema);
        System.out.println("Duração: " + getTotalEmMinutos() + " minutos");
        System.out.println("Premiado: " + (this.premiado ? "Sim" : "Não"));
    }

    // Métodos Getters e Setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public boolean isPremiado() {
        return premiado;
    }

    public void setPremiado(boolean premiado) {
        this.premiado = premiado;
    }
}