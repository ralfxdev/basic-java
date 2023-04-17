import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text_1 = "";
        String text_2 = "";

        int count_char = 0;
        int start_char = 0;
        int end_char = 0;

        System.out.println("Enter your first text: ");
        text_1 = input.nextLine();

        count_char = text_1.length();

        System.out.println("The text " + text_1 + " have " + count_char + " characters.");

        System.out.println("Where you want to extract characters from?: ");
        start_char = input.nextInt();

        System.out.println("How far you want to extract characters?: ");
        end_char = input.nextInt();

        text_2 = text_1.substring(start_char, end_char);
        System.out.println("The extracted text is " + text_2);

        input.close();
    }
}
