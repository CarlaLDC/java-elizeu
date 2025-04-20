import java.util.Scanner;

public class Main{
    
    public void get_soma (int x, int y ) {
        
        int soma = 0;
        
        for (int i = x ; i <= y; i++) {
            if ( i % 2 != 0){
                soma += i;
                
            }
        }
        
         System.out.println("Soma dos números impares = " + soma);
    }
    
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    
        System.out.println("Informe os números");
        int a = ler.nextInt();
        int b = ler.nextInt();
        
	    Main m1 = new Main();
        m1.get_soma(a, b);
	    
		
	}
}
