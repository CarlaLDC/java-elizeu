import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
  
        System.out.println("Informe três valores para um triângulo:");
        int A = ler.nextInt();
        int B = ler.nextInt();
        int C = ler.nextInt();
  
          if ( A + B + C != 180 ){
  
            System.out.println("A figura não é um triângulo. ");
             
          }

          else if ( A == B && B == C ){
  
            System.out.println("O triangulo é equilátero" );
             
          }

          else if ( A != B && A != C && B != C ){
  
            System.out.println("O triangulo é escaleno" );
             
          }

         else {
  
            System.out.println("O triangulo é isósceles" );
             
          }
  
      }
}
