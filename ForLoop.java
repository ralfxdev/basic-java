public class ForLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            String lap = "";
            if (i == 1) {
                lap = "lap";
            }
            else {
                lap = "laps";
            }
            System.out.println("We have " + i + " " + lap);
        }
    }
}
