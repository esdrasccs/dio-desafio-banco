import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in).useLocale(Locale.US);;

        Banco banco = new Banco();

        System.out.print("Por favor, digite seu nome:");
        banco.setNomeCliente(scan.nextLine());

        System.out.println("Olá Sr(a), "+banco.getNomeCliente()+". Seguiremos agora com a solicitação dos dados para abertura de sua conta.");
        System.out.println(" ");

        System.out.print("Por favor, digite  o numero da agencia desejada: ");
        banco.setAgencia(scan.nextLine());

        System.out.println(" ");

        System.out.print("Digite agora o numero da conta: ");
        banco.setNumero(scan.nextInt());

        System.out.println(" ");

        System.out.print("Agora entre com seu saldo: ");
        banco.setSaldo(scan.nextDouble());

        banco.saldacaoCliente();

    }
}