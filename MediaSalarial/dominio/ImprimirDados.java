package academy.devhugo.maratonajava.javacore.Bintroducaometodos.desafio.dominio;

public class ImprimirDados {
    public void imprime (Funcionario funcionario){
        System.out.println("====================");

        System.out.println("Nome: "+funcionario.nome);

        System.out.println("Idade: "+funcionario.idade);

        double [] number = new double [3];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Salario "+ i + " : " + funcionario.salario[i]);
        }
        System.out.println("====================");
    }



}
