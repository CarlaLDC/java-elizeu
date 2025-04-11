import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String tipo = "";
        double a = 0;
        double b = 0;
        double c = 0;
        double sp = 0;

        int itemMenu = 0;

        boolean verdade = true;

        while ( verdade ) {
            System.out.println("---Menu---");
            System.out.println("1 - Executar");
            System.out.println("2 - Finalizar");

            System.out.println("Informe um número: ");
            itemMenu = ler.nextInt();

            if ( itemMenu == 1 ){
                System.out.println("Informe o lado A: ");
                a = ler.nextDouble();

                System.out.println("Informe o lado B: ");
                b = ler.nextDouble();

                System.out.println("Informe o lado C: ");
                c  = ler.nextDouble();

                if ( a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0 ) {
                    System.out.println("Erro! Lados Inválidos. ");

                }

               
                else if ( a == b && b == c ){
                    sp = ( a + b + c ) / 2;

                    tipo = "Equilátero.";

                    System.out.println("O triangulo é " + tipo);
                    System.out.println("O semiperímetro é " + sp);

                }

                else if ( a != b && a != c && b != c ){
                    sp = ( a + b + c ) / 2;

                    tipo = "Escaleno.";

                    System.out.println("O triangulo é " + tipo);
                    System.out.println("O semiperímetro é " + sp);

                }

                else {
                    sp = ( a + b + c ) / 2;

                    tipo = "Isósceles.";

                    System.out.println("O triangulo é " + tipo);
                    System.out.println("O semiperímetro é " + sp);

                }
    
            }
    
            else if ( itemMenu > 2 ){
              System.out.println("Operação inválida!");
    
            }
            
            else {
               break;
            }
        }
    
    } 

}
