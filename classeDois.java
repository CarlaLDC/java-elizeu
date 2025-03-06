import java.util.Scanner;

public class classeDois {

     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
  
        System.out.println("Informe duas notas:");
        double notaUm = ler.nextDouble();
        double notaDois = ler.nextDouble();

        System.out.println("Informe o número de faltas:");
        int faltas = ler.nextInt();
  
          if ( faltas == 20 ){
  
            System.out.println("Reprovado por faltas. ");
             
          }

          else if ( notaUm < 3 ){
  
            System.out.println("Reprovado por notas." );
             
          }

          else if ( notaUm >= 3 && notaDois <= 5 ){
  
            System.out.println("Aluno de recuperação." );
             
          }

          else if ( notaUm > 5 && notaDois < 6 ){
  
            System.out.println("Aluno em exame." );
             
          }

         else {
  
            System.out.println("Aluno aprovado." );
             
          }
  
      }
}
