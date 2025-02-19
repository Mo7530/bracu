import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
        int sum = 0;
        int count = 0;

        System.out.println("Enter numbers (type 'done' to finish):");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            data.add(number);
            sum += number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("Data entered: " + data);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Total number of data entries: " + count);
        } else {
            System.out.println("No data entered.");
        }

        scanner.close();
    }
}