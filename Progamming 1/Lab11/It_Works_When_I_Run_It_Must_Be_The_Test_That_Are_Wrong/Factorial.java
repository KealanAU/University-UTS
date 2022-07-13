import java.util.Scanner;

public class Factorial {

    public static long factorial(int n) {
        long factorial = 1;
        if(n < 0) return -1;
        // System.out.println(n);
        for (long i = 1; i <= n; i++) {
            
            factorial = factorial * i;
        }
        return factorial;   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The factoral of " + n + " is " + factorial(n));
        sc.close();
    }
}