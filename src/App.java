import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 2 numbers: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.max(num1, num2) + " is the larger number.");
        System.out.println("Enter another number: ");
        int num3 = Integer.parseInt(scanner.nextLine());
        System.out.println(num3 + " is " + (num3 % 2 == 0 ? "Odd" : "Even"));
        System.out.println("Enter a colour: ");
        String colour = scanner.nextLine();

        if (colour.equals("Green")){
            System.out.println("Go!");
        }
        else if (colour.equals("Red")){
            System.out.println("Stop!");
        }
        else {
            System.out.println(colour + " is not red or green.");
        }
    }
}
