//6.	 Program to demonstrate working of bitwise operators in C.
import java.util.Scanner;

public class prg_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        // Bitwise &
        int andResult = num1 & num2;
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise |
        int orResult = num1 | num2;
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise ^
        int xorResult = num1 ^ num2;
        System.out.println("Bitwise XOR: " + xorResult);

        // Bitwise ~
        int notNum1 = ~num1;
        int notNum2 = ~num2;
        System.out.println("Bitwise NOT of first number: " + notNum1);
        System.out.println("Bitwise NOT of second number: " + notNum2);
    }       
}
