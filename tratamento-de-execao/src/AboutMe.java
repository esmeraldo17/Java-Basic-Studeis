import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         System.out.println("Diigite seu nome");
         String nome = scanner.next();

         System.out.println("Diigite seu sobrenome");
         String sobrenome = scanner.next();

         System.out.println("Diigite seu idade");
         int idade = scanner.nextInt();

         System.out.println("Diigite seu idade");
         double altura = scanner.nextDouble();

         System.out.println("ola, me chamo" + nome.toUpperCase() + " " + sobrenome.toUpperCase());
         System.out.println("Tenho" +  idade + " anos");
         System.out.println("Minha altura e " + altura + "cm");

         scanner.close();

    }
}
