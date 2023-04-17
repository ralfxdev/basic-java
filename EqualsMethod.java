import java.util.Scanner;

public class EqualsMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String today_pglang = "";
        String tomorrow_pglang = "";

        System.out.print("What programming language are we learning today?: ");
        today_pglang = input.nextLine();

        System.out.print("What programming language will we learn tomorrow?: ");
        tomorrow_pglang = input.nextLine();

        if(today_pglang.equals(tomorrow_pglang)){
            System.out.println("We are learning every day: " + today_pglang);
        } else {
            System.out.println("We are learning: " + today_pglang + " & " + tomorrow_pglang);
        }

        input.close();
    }
}
