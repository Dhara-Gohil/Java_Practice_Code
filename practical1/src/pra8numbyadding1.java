import java.util.Scanner;

public class pra8numbyadding1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a five-digit number: ");
            int number = sc.nextInt();

            int newNumber = 0;
            int multiplier = 1;

            while (number > 0) {
                int digit = number % 10;
                digit = (digit + 1) % 10;
                newNumber += digit * multiplier;
                multiplier *= 10;
                number /= 10;
            }
            System.out.println("New number after adding one to each digit: " + newNumber);
        }
}