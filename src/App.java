import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Input 2 numbers: ");
        // int num1 = Integer.parseInt(scanner.nextLine());
        // int num2 = Integer.parseInt(scanner.nextLine());
        // System.out.println(Math.max(num1, num2) + " is the larger number.");
        // System.out.println("Enter another number: ");
        // int num3 = Integer.parseInt(scanner.nextLine());
        // System.out.println(num3 + " is " + (num3 % 2 == 0 ? "Odd" : "Even"));
        // System.out.println("Enter a colour: ");
        // String colour = scanner.nextLine();

        // if (colour.equals("Green")){
        //     System.out.println("Go!");
        // }
        // else if (colour.equals("Red")){
        //     System.out.println("Stop!");
        // }
        // else {
        //     System.out.println(colour + " is not red or green.");
        // }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 4: ");
        int chosenNum = Integer.parseInt(scanner.nextLine());
        switch (chosenNum) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Not in the range!");
                break;
        }
    }
}
