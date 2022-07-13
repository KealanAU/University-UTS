import java.util.Scanner;

public class Clean {

    public static boolean test(int value) {
        return ((value < 10) ? true : false);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(test(sc.nextInt()));
        sc.close();
    }
}