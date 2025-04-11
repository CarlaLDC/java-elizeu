import java.util.Scanner;

public class Classe4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome = "";
        double valor = 0;
        int cont = 0;
        double saldo = 0;
        double media = 0;

        int itemMenu = 0;

        boolean verdade = true;

        while ( verdade ) {
            System.out.println("---Menu---");
            System.out.println("1 - Ler processar");
            System.out.println("2 - Resultados");
            System.out.println("3 - Sair");

            System.out.println("Informe um número: ");
            itemMenu = ler.nextInt();

            if ( itemMenu == 1 ){
                if ( cont == 0 ) {
                    System.out.println("Informe seu nome: ");
                    nome = ler.next();
    
                    System.out.println("Informe o valor: ");
                    valor = ler.nextDouble();
                    
                    cont += 1;
                    saldo += valor;
                    media = saldo / cont;
                }
    
                else {
                    System.out.println("Informe o valor: ");
                    valor = ler.nextDouble();
                    
                    cont += 1;
                    saldo += valor;
                    media = saldo / cont;
                }
    
            }
    
            else if ( itemMenu == 2 ){
                    System.out.println("O nome informado foi: " + nome);
                    System.out.println("A contagem foi: " + cont);
                    System.out.println("O saldo total foi: " + saldo);
                    System.out.println("A media final foi: " + media);
    
            }
    
            else if ( itemMenu > 3 ) {
                System.out.println("Operação inválida!");
            }
    
            
            else {
               break;
            }
        }
    
    } 

}
