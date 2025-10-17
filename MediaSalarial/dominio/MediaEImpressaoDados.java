package academy.devhugo.maratonajava.javacore.Bintroducaometodos.desafio.dominio;

public class MediaEImpressaoDados {

    public void mediaVarArgs (double ... numeros){
        double multi = 0;


        for(double num : numeros){
            multi += (num / 3);
        }

        System.out.println("Media das notas: " + multi);
    }
}
