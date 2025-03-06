import java.util.Scanner;

public class imc {
   public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
   
       System.out.println("Informe seu nome:");
       String nome = ler.next();

       System.out.println("Informe o seu peso:");
       int peso = ler.nextInt();

       System.out.println("Informe a sua altura:");
       double altura = ler.nextDouble();

       double imc = peso / ( altura * altura );

       if ( imc < 18.5 ) {
         System.out.println(" O seu IMC é " + imc);
         System.out.println("Abaixo do peso");

       }
   
       else if ( imc >= 18.5 && imc < 24.9 ) {
         System.out.println(" O seu IMC é " + imc);
         System.out.println("Peso Normal");

       }

       else {
         System.out.println(" O seu IMC é " + imc);
         System.out.println("Está com sobrepeso");

       }
   
       }
    }
