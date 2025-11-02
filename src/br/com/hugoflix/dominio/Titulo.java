package br.com.hugoflix.dominio;

public class Titulo implements Comparable<Titulo>{
    private String nomeTitulo;
    private int dataLancamento;
    private double avaliacao;
    private int totalAvaliacao;
    private double mediaAvaliacao;

    public Titulo(String nomeTitulo, int dataLancamento) {
        this.nomeTitulo = nomeTitulo;
        this.dataLancamento = dataLancamento;
    }
//    public Titulo(String nomeTitulo, int dataLancamento) {
//        this.nomeTitulo = nomeTitulo;
//        this.dataLancamento = dataLancamento;
//        this.avaliacao = avaliacao;
//        this.totalAvaliacao = totalAvaliacao;
//        this.mediaAvaliacao = mediaAvaliacao;
//    }

    public void exibeDetalhesTitulo(){
        System.out.println("Nome: "+ this.nomeTitulo);
        System.out.println("Ano de lancamento: "+this.dataLancamento);
        System.out.println("Quantidade avalicoes: "+this.totalAvaliacao);

    }

    public void avalia(double nota){
        avaliacao += nota;
        totalAvaliacao ++;
    }

    public void mediaAvaliacao (){
        double media;
        media = avaliacao / totalAvaliacao;
        System.out.println("media das avalicacoes: " + media);

    }


    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public int getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;

    }

    public double getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao() {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return getNomeTitulo().compareTo(outroTitulo.getNomeTitulo());
    }
}
