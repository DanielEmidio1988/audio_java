package br.com.alura.audio;

public class Audio implements Interacao {
    protected String titulo;
    private int duracaoMinutos;
    protected int totalReproducoes;
    protected int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getClassificacao() {
        return classificacao;
    }

    @Override
    public void curtirAudio(){
        curtidas++;
    }

    @Override
    public void reproduzirAudio(){
        return;
    }

    public void listaAudio(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Total de Reproduções: " + totalReproducoes);
    }
}
