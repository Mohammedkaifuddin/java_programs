//3. Write a program to demonstrate the use of increment and decrement operators.

public class prg_3 {
    public static void main(String[] args) {
        int a = 5, b = 10;

        //post-increment
        System.out.println("a = " + a);
        System.out.println("Post-increment a++: " + (a++)); 
        System.out.println("Value of a after a++: " + a);   

        //pre-increment
        System.out.println("Pre-increment ++a: " + (++a));  

        // Post-decrement
        System.out.println("b = " + b);
        System.out.println("Post-decrement b--: " + (b--)); 
        System.out.println("Value of b after b--: " + b);   

        // Pre-decrement
        System.out.println("Pre-decrement --b: " + (--b));  
    }
}
