import java.util.Scanner;
public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask for surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        // Ask for age
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        // Calculate number of characters in surname
        int surnameLength = surname.length();
        
        // Determine if age is even or odd
        String ageType = (age % 2 == 0) ? "even" : "odd";

        // Print results
        System.out.println("The number of characters in your surname is " + surnameLength + ".");
        System.out.println("Your current age is an " + ageType + " number.");
        scanner.close();
    }
}
