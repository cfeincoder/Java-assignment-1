import java.util.Scanner; 

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[5];
        double sum = 0.0;

        // Input marks for five units
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for unit " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            sum += marks[i];
        }

        // Calculate average
        double average = sum / 5;

        // Display average formatted to two decimal places
        System.out.printf("Average marks: %.2f%n", average);

        scanner.close();
    }
}


