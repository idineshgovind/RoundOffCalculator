import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to round off : ");
        int num = scan.nextInt();
        RoundCalculator round = new RoundCalculator(num);
        round.choosingMethod();

    }
}
