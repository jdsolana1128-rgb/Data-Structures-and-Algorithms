
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nArray Elements:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n\nEnter a number to search:");
        int search = input.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println("Number found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }

        input.close();
    }
}
