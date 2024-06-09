import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome !");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o número da conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta +" e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
