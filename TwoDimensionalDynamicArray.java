import java.util.Scanner;

public class TwoDimensionalDynamicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = 0;
        int column = 0;
        int incrementer = 1;
        
        System.out.print("How many rows do you want?: ");
        row = input.nextInt();

        System.out.print("How many column do you want?: ");
        column = input.nextInt();

        int array[][] = new int[row][column];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                array[i][j] = incrementer;
                incrementer++;
                System.out.print("[" + array[i][j] + "]");
            }
        }

        input.close();
    }
}
