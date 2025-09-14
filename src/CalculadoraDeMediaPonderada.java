import java.util.Scanner;

public class CalculadoraDeMediaPonderada {

        double nota1;
        double nota2;
        double nota3;
        double peso1;
        double peso2;
        double peso3;
        double resultadoDaMedia;
        String nome;

        public void obterDados (){
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite o nome do aluno: ");
            nome = leitor.nextLine();

            System.out.print("Digite o peso da atividade 1:");
            peso1 = leitor.nextDouble();
            System.out.print("Digite a nota da atividade  1:");
            nota1 = leitor.nextDouble();

            System.out.print("Digite o peso da atividade 2:");
            peso2 = leitor.nextDouble();
            System.out.print("Digite a nota da atividade 2:");
            nota2 = leitor.nextDouble();

            System.out.print("Digite o peso da atividade 3:");
            peso3 = leitor.nextDouble();
            System.out.print("Digite a nota da ativiade 3:");
            nota3 = leitor.nextDouble();

            calcularMediaPonderada();

        }

        public void calcularMediaPonderada (){

            resultadoDaMedia = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

            exibirResultado();

        }

        public void exibirResultado(){
            System.out.println("***********************************");
            System.out.println("NOME DO ALUNO: " + nome);
            System.out.println("A média ponderada do aluno " + nome + " é : " + resultadoDaMedia);
            System.out.println("***********************************");
        }

}
