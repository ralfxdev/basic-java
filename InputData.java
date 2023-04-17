import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int average = 0;
        int score_1 = 0;
        int score_2 = 0;
        int score_3 = 0;
        
        System.out.println("Enter your first score: ");
        score_1 = input.nextInt();

        System.out.println("Enter your second score: ");
        score_2 = input.nextInt();

        System.out.println("Enter your third score: ");
        score_3 = input.nextInt();

        average = (score_1 + score_2 + score_3) / 3;
        
        if (average >= 7) {
            System.out.println("Approved! The average is: " + average);
        } else {
            System.out.println("Not approved! The average is: " + average);
        }

        input.close();
    }
}