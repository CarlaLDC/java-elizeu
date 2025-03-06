import java.util.Scanner;

/* 

Desenvolva os algoritmos, seus respectivos diagramas de bloco e sua codificação em Portuês Estruturado (Você
deve gravar o exercício “a” como L02A, o exercício “b” como L02B, e assim por diante):

a. Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.

*/

public class L02B {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

      System.out.println("Informe um numero");
      int numeroUm = ler.nextInt();

        if ( numeroUm < 0 ){
            int multiplicacao = numeroUm * -1;
            System.out.println(multiplicacao);
        }

        else {
            System.out.println(numeroUm);
        }


    }

}


