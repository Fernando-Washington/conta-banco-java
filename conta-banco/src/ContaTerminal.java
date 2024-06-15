import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in); //declarando variáveis
         
            //questão para o usuário responder
        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt(); // Lê um número inteiro

        System.out.println("Por favor, digite o número da Agência!" ); 
        int agencia = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Qual o seu nome?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo" ); 
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
        
        scanner.close(); //Fecha o Scanner
    }
}

