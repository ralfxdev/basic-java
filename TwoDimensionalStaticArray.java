public class TwoDimensionalStaticArray {
    public static void main(String[] args) {
        String countries[][] = new String[3][4];

        countries[0][0] = "Mexico";
        countries[0][1] = "Ecuador";
        countries[0][2] = "Colombia";
        countries[0][3] = "Grecia";
        countries[1][0] = "Francia";
        countries[1][1] = "Italia";
        countries[1][2] = "Alemania";
        countries[1][3] = "Brasil";
        countries[2][0] = "Japon";
        countries[2][1] = "China";
        countries[2][2] = "Guatemala";
        countries[2][3] = "Chile";

        for(int i = 0; i <= countries.length-1; i++){
            for(int j = 0; j <= countries[i].length-1; j++)
            System.out.println("[" + i + "]" + "[" + j + "]" + "[" + countries[i][j] + "]");
        }
    }
}
