//4.	Write a program to find largest of two no’s using Ternary operator.
import java.util.Scanner;

public class prg_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int largest = (num1 > num2) ? num1 : num2;

        System.out.println("The largest number is: " + largest);
    }
}
