package br.com.alura.audio;

public class PodCast extends Audio{
    private String conteudo;
    private String apresentador;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void reproduzirAudio(){
        System.out.println("Nosso Podcast " + titulo + " vai começar!");
        System.out.println("Apresentador: " + apresentador);
        System.out.println(conteudo);
        totalReproducoes++;
    }

    @Override
    public int getClassificacao() {
        int totalClassificacao = 0;
        if(curtidas >= 2 && curtidas < 3){
            totalClassificacao = 2;
        }

        if(curtidas >= 4 && curtidas < 10){
            totalClassificacao = 5;
        }

        if(curtidas >= 10){
            totalClassificacao = 10;
        }
        return totalClassificacao;
    }
}
