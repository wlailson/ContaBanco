import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 237.48;  
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         //recebendo parametros
        System.out.println("Por favor, digite o número da Agência");
        String agencia =  scanner.next() ;

        System.out.println("Por favor, digite o seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da conta");
        int numero = scanner.nextInt();
        
        // imprimindo os parametros
        System.out.print("Olá " + nome + ", Obrigado por criar uma conta em nosso banco,");
        System.out.print(" sua agência é " + agencia);
        System.out.print(", conta " + numero);
        System.out.print(" e seu saldo " + saldo + " ja esta disponivel para saque");


    }
}
