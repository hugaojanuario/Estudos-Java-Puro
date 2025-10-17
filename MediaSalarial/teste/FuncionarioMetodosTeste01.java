package academy.devhugo.maratonajava.javacore.Bintroducaometodos.desafio.teste;

import academy.devhugo.maratonajava.javacore.Bintroducaometodos.desafio.dominio.Funcionario;
import academy.devhugo.maratonajava.javacore.Bintroducaometodos.desafio.dominio.ImprimirDados;
import academy.devhugo.maratonajava.javacore.Bintroducaometodos.desafio.dominio.MediaEImpressaoDados;

public class FuncionarioMetodosTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        ImprimirDados imprimir = new ImprimirDados();
        MediaEImpressaoDados media = new MediaEImpressaoDados();

        double [] number = {7,8,9};
        funcionario.nome = "Hugo";
        funcionario.idade = 21;
        funcionario.salario = number;

        imprimir.imprime(funcionario);

        media.mediaVarArgs(funcionario.salario);
    }

}
