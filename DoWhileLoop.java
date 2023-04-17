public class DoWhileLoop {
    public static void main(String[] args) {
        int toys = 20;

        do{
            if(toys != 0) {
                System.out.println("There are available " + toys + " toys.");
            }
            else {
                System.out.println("There aren't available toys.");
            }
            toys-=1;
        }while(toys >= 0);
    }
}
