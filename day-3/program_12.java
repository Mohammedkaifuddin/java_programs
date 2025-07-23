// 12. program to multiply an integer with 2 without using binary operator(*)
import java.util.Scanner;
public class program_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();

         int result;
         result = num << 1;

         System.out.println("The result of dividing " + num + " by 2 is: " + result);
    }
}
