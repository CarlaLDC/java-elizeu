import java.util.Scanner;

public class cadastros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] idades = new int[3];
        double[] salarios = new double[3];
        double[] novoSal = new double[3];

        int opcao = 0;

        do {
            System.out.println("--Menu:---");
            System.out.println("1 - Cadastrar dados");
            System.out.println("2 - Exibir dados");
            System.out.println("3 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
                        nomes[i] = ler.nextLine();

                        System.out.print("Digite a idade de " + nomes[i] + ": ");
                        idades[i] = Integer.parseInt(ler.nextLine());

                        System.out.print("Digite o salário de " + nomes[i] + ": R$ ");
                        salarios[i] = Double.parseDouble(ler.nextLine());

                        if (idades[i] > 18) {
                            novoSal[i] = salarios[i] * 1.15;
                        } 
                        
                        else {
                            novoSal[i] = salarios[i] * 1.08;
                        }
                    }

                    break;

                case 2:
                    System.out.println("--- Dados Cadastrados ---");

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Nome: " + nomes[i]);
                        System.out.println("Idade: " + idades[i]);
                        System.out.println("Salário Original: R$ " + salarios[i]);
                        System.out.println("Novo Salário: R$ " + novoSal[i]);
                    }

                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

            }
        } while (opcao != 3);
    }
}