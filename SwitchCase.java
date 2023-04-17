import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int combo = 0;
        int select_ctrl = 0;

        System.out.println("*******************************************************");
        System.out.println("              Welcome! to the movies");
        System.out.println("*******************************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("What combo do you want to buy?: ");
        select_ctrl = input.nextInt();

        switch (select_ctrl) {
            case 1:
                combo = 70;
                System.out.println("The price of combo 1 that includes popcorn and soda is: " + combo);
                break;

            case 2:
                combo = 90;
                System.out.println("The price of combo 2 that includes hotdog and soda is: " + combo);
                break;

            case 3:
                combo = 80;
                System.out.println("The price of combo 3 that includes nachos and soda is: " + combo);
                break;

            case 4:
                combo = 120;
                System.out.println("The price of combo 4 that includes pizza and soda is: " + combo);
                break;
        
            default:
                System.out.println("The selected option is invalid!");
                break;
        }

        input.close();
    }
}