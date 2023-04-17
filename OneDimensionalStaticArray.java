public class OneDimensionalStaticArray {
    public static void main(String[] args) {
        String programming_lang[] = new String[5];

        programming_lang[0] = "Java";
        programming_lang[1] = "Python";
        programming_lang[2] = "C#";
        programming_lang[3] = "Javascript";
        programming_lang[4] = "C++";

        for(int i = 0; i <= programming_lang.length-1; i++){
            System.out.println("[" + i + "]" + "[" + programming_lang[i] + "]");
        }
    }
}