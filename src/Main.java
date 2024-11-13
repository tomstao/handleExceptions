import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // try can use automatic resources management to close the scanner.
            System.out.println("Enter a whole number to divide:");
            int a = scanner.nextInt();
            System.out.println("Enter a whole number to divide by:");
            int b = scanner.nextInt();
            int z = a / b;
            System.out.println("Result: " + z);
            // If we try to divide by 0 without try block and catch, that will create an ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("Error: you divided a number by zero!");
            // We will catch the error here, and then perform the code in the parenthesis.
        } catch (InputMismatchException e) {
            System.out.println("Error: you entered an invalid character!");
            // This time we will catch the invalid input (a non-number character)
        } catch (Exception e) {
            System.out.println("Error! Unknown error!");
            // We better to handle different errors individually, and this line will catch all
            // errors.
        } finally {
            // Don't forget to close the scanner!
            System.out.println("Thank you for using our program!");
            // The code within finally block will be executed no matter whether we catch the error.
        }
    }
}