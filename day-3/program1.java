import java.util.Scanner;
// swapping of 2 number without using third variable
public class program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 10, b=20;

        // a = a + b;
        // b = a - b;
        // a = a - b;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
