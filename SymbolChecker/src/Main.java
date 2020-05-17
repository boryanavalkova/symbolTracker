import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("---Expression checker 101---");
        System.out.println("Enter expression:");

        String str = scanner.nextLine();  // Read user input
        Expression exp = new Expression();
        var result = exp.isBalanced(str);
        System.out.print(result);
    }
}
