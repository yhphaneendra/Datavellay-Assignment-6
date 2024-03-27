import java.util.Scanner;

public class FindLargestSmallestAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

           
            largest = Math.max(largest, number);
            smallest = Math.min(smallest, number);

            
            sum += number;
            count++;

            System.out.print("Do you want to enter another number? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        if (count > 0) {
          
            double average = (double) sum / count;

           
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
