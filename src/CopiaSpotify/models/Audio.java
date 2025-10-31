package CopiaSpotify.models;

public class Audio {
    private String tituloAudio;
    private double duracaoMinutos;
    private double avaliacao;

    public void exibirAudio(){
        System.out.println(this.tituloAudio);
        System.out.println(this.duracaoMinutos);
        System.out.println(this.avaliacao);
    }

    public String getTituloAudio() {
        return tituloAudio;
    }

    public void setTituloAudio(String tituloAudio) {
        this.tituloAudio = tituloAudio;
    }

    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(double duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}
