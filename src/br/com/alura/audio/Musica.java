package br.com.alura.audio;

public class Musica extends Audio{
    private String letra;
    private String artista;

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void reproduzirAudio(){
        System.out.println("Solta o som DJ!!!");
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println(letra);
        totalReproducoes++;
    }

    @Override
    public int getClassificacao() {
        int totalClassificacao = 0;
        if(curtidas >= 1 && curtidas < 4){
            totalClassificacao = 2;
        }

        if(curtidas >= 2 && curtidas < 3){
            totalClassificacao = 5;
        }

        if(curtidas >= 3){
            totalClassificacao = 10;
        }
        return totalClassificacao;

    }
}
