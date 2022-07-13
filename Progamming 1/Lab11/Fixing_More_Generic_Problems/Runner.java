import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        Holder h = new Holder(input);

        String output = h.getElement();
        System.out.println("You entered " + output + ".");

        sc.close();
    }
}
