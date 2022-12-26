import java.util.Scanner;

public class RoundCalculator {
    Scanner scan = new Scanner(System.in);
    int number;

        public RoundCalculator(int num) {
            number = num;
        }
        public void choosingMethod(){
            System.out.println("Enter a option "+"\n"+"1-RoundOff to Tens"+"\n"+"2-RoundOff to Hundreds");
            int option = scan.nextInt();

            if(option==1){
                round10();
            } else if (option==2) {
                round100();
            }
        }
        public void round10() {
            int lastDigit = number % 10;
            if (lastDigit == 0) {
                System.out.println("The Round Off Number is : "+number);
            } else if (lastDigit < 5) {
                System.out.println(number - lastDigit);
            } else {
                System.out.println("The Round Off Number is : "+(10 - lastDigit) + number);
            }
        }
        public void round100() {
            int lastDigit = number%100;
                if (lastDigit == 0) {
                    System.out.println(number);
                } else if (lastDigit < 49) {
                    System.out.println("The Round Off Number is : "+ (number - lastDigit));
                } else {
                    System.out.println("The Round Off Number is : "+(100 - lastDigit) + number);
                }

        }
}
