import java.util.Scanner;

public class OneDimensionalDynamicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int week_days = 0;

        System.out.print("How many days do you want to add?: ");
        week_days = input.nextInt();

        int sales[] = new int[week_days];

        for(int i = 0; i <= sales.length-1; i++){
            System.out.print("Enter the amount sold for the day " + (i+1) + ": ");
            sales[i] = input.nextInt();
        }

        for (int i = 0; i <= sales.length-1; i++){
            System.out.println("Day: [" + (i+1) + "] - " + "Sale: [$." + sales[i] + "].");
        }

        input.close();
    }
}
