import java.util. Scanner;

public class Main {
    public void get_fatorial (int num ) {

    int soma = 1;
        
        
    for (int i = 1; i <= num; i++ ){
        soma = soma * i;
        
    }
        
    System.out.println("O fatorial é: " + soma);
        
    }
        

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Informe um número: ");
        int num = ler.nextInt();
        
        Main m1 = new Main();
        m1.get_fatorial(num);
        
        }


    }



