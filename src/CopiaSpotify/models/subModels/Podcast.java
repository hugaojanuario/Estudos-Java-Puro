package CopiaSpotify.models.subModels;

import CopiaSpotify.calcs.CalculoAvaliacao;
import CopiaSpotify.models.Audio;

import java.awt.geom.Point2D;

public class Podcast extends Audio implements CalculoAvaliacao {
    private String temaEpsodio;
    private String convidadoEpsodio;

    public Podcast(String temaEpsodio, String convidadoEpsodio) {
        this.temaEpsodio = temaEpsodio;
        this.convidadoEpsodio = convidadoEpsodio;
    }

    public void exibirPodcast(){
        exibirAudio();
        System.out.println(this.temaEpsodio);
        System.out.println(this.convidadoEpsodio);

    }

    public String getTemaEpsodio() {
        return temaEpsodio;
    }

    public void setTemaEpsodio(String temaEpsodio) {
        this.temaEpsodio = temaEpsodio;
    }

    public String getConvidadoEpsodio() {
        return convidadoEpsodio;
    }

    public void setConvidadoEpsodio(String convidadoEpsodio) {
        this.convidadoEpsodio = convidadoEpsodio;
    }

    @Override
    public int getRecomendacaoAvaliacao() {
        return (int) getAvaliacao();
    }
}
