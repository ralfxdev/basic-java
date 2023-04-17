public class Conditional {
    public static void main(String[] args) {
        int average = 0;
        int score_1 = 8;
        int score_2 = 9;
        int score_3 = 8;

        average = (score_1 + score_2 + score_3) / 3;
        
        if (average >= 7) {
            System.out.println("Approved! The average is: " + average);
        } else {
            System.out.println("Not approved! The average is: " + average);
        }
    }
}