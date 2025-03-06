import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
  
        System.out.println("Informe três valores:");
        int valorUm = ler.nextInt();
        int valorDois = ler.nextInt();
        int valorTres = ler.nextInt();
  
          if ( valorUm > valorDois && valorUm > valorTres ){
  
            System.out.println("O maior valor é: " + valorUm);
             
          }

          else if ( valorDois > valorUm && valorDois > valorTres ){
  
            System.out.println("O maior valor é: " + valorDois);
             
          }
  
          else if ( valorTres > valorDois && valorTres > valorUm){
  
            System.out.println("O maior valor é: " + valorTres);
             
          }
  
          else {
              System.out.println("Error! Tente novamente.");
          }
  
  
      }
}
