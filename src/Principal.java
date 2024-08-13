import br.com.alura.audio.Musica;
import br.com.alura.audio.PodCast;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Would?");
        musica.setArtista("Alice in Chains");
        musica.setLetra("""
            Know me broken
            Teach thee on child, love of hereafter
            
            Into the floop again...
        """);
        musica.setDuracaoMinutos(3);
        musica.curtirAudio();
        musica.curtirAudio();
        musica.curtirAudio();
        musica.reproduzirAudio();
        musica.reproduzirAudio();
        musica.listaAudio();
        System.out.println("Classificação: " + musica.getClassificacao());

        System.out.println("""
                
                
                """);

        PodCast podCast = new PodCast();
        podCast.setTitulo("Café com Tech!");
        podCast.setApresentador("DanielDev");
        podCast.setDuracaoMinutos(14);
        podCast.setConteudo("Está o ar seu podCast Café com Tech! Tudo o que precisa saber sobre o mercado de tecnologia.");
        podCast.curtirAudio();
        podCast.curtirAudio();
        podCast.reproduzirAudio();
        podCast.reproduzirAudio();
        podCast.reproduzirAudio();
        podCast.reproduzirAudio();
        podCast.reproduzirAudio();
        podCast.listaAudio();
        System.out.println("Classificação: " + podCast.getClassificacao());

    }
}