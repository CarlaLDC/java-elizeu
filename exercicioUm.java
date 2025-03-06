import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

      System.out.println("Informe o numero de lados:");
      int numLados = ler.nextInt();

        if ( numLados == 3 ){
            System.out.println("Informe a medida do lados A, B e C:");
            int a = ler.nextInt();
            int b = ler.nextInt();
            int c = ler.nextInt();

            int S = ( a + b + c ) / 2;

            double raiz = S * ( S - a ) * ( S - b ) * ( S - c );

            double areaTriangulo = Math.sqrt(raiz);


            System.out.println("O polígono é um triângulo.");
            System.out.println("Área do triângulo: " + areaTriangulo);
        }

        else if ( numLados == 4 ) {
            System.out.println("Informe a medida do lado: ");
            int medida = ler.nextInt();

            int areaQuadrado = medida * medida;

            System.out.println("O polígono é um quadrado.");
            System.out.println("Área do quadrado: " + areaQuadrado);
            
        }

        else if ( numLados == 5 ) {
            System.out.println("Informe a medida do lado: ");
            int medida = ler.nextInt();

            System.out.println("Informe a apótema: ");
            double apotema = ler.nextDouble();

            double perimetro = medida * 5;

            double areaPentagono = perimetro / 2 * apotema;

            System.out.println("O polígono é um pentágono.");
            System.out.println("Área do pentágono: " + areaPentagono);
            
        }

        else if ( numLados < 3 ) {
           System.out.println("Não é um polígono.");
        }

        else {
            System.out.println("Error! Polígono não identificado.");
        }


    }

}