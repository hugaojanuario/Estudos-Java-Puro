package CopiaSpotify.calcs;

public class Recomendacao {
    public void recomendaEstrela(CalculoAvaliacao calculoAvaliacao){
        if (calculoAvaliacao.getRecomendacaoAvaliacao() >= 10000){
            System.out.println("Esta entre os 10 melhores");
        }else if (calculoAvaliacao.getRecomendacaoAvaliacao() <= 4 && calculoAvaliacao.getRecomendacaoAvaliacao() >= 3){
            System.out.println("muito bem avaliado");
        }else {
            System.out.println("nao tao bem aceito");
        }
    }


}
