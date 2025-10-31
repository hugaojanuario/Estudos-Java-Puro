package CopiaSpotify.test;

import CopiaSpotify.calcs.Recomendacao;
import CopiaSpotify.models.subModels.Musica;
import CopiaSpotify.models.subModels.Podcast;

public class MainTest {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Rock");
        Podcast podcast1 = new Podcast("A foma por poder", "Renan Santos");
        Recomendacao recomendacao = new Recomendacao();

        musica1.setTituloAudio("Só Rock");
        musica1.setAvaliacao(100);
        musica1.setDuracaoMinutos(2.30);
        musica1.exibirMusica();
        recomendacao.recomendaEstrela(musica1);

        System.out.println("-----------");

        podcast1.setTituloAudio("PodPah");
        podcast1.setDuracaoMinutos(45.23);
        podcast1.setAvaliacao(3400);
        podcast1.exibirPodcast();
        recomendacao.recomendaEstrela(podcast1);



    }


}
