//7. Program to find one’s complement (bitwise) of any number. 
import java.util.Scanner;

public class prg_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int onesComp = ~num;
        System.out.println("The one's complement of " + num + " is: " + onesComp);
    }
}
