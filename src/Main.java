import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter amount and currency code:\n>>>");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parameters = input.split(" ");

        Integer amount = Integer.valueOf(parameters[0]);
        String currencyCode = parameters[1];

        Currency currency = Currency.valueOf(currencyCode);
        String endingMessage = currency.getEndingMessage(amount);


        System.out.println(amount + " " + endingMessage);
    }
}