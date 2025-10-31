package CopiaSpotify.models.subModels;

import CopiaSpotify.calcs.CalculoAvaliacao;
import CopiaSpotify.models.Audio;

public class Musica extends Audio implements CalculoAvaliacao {
    private String generoMusical;

    public Musica(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public void exibirMusica(){
        exibirAudio();
        System.out.println(this.generoMusical);
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public int getRecomendacaoAvaliacao() {
        return (int) getAvaliacao();

    }
}
