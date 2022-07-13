import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        sc.nextLine();

        Holder<Integer> h = new Holder<Integer>(input);

        Integer output = h.getElement();
        System.out.println("You entered " + output + ".");        

        sc.close();
    }
}
