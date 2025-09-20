public class Introduction {
    public static void main(String[] args) {
        System.out.print("Tran Thi Nguyen Ha\t24020116\t" +
                "K69I-IT1\ttranha-1908\ttranthinguyenhasky@gmail.com\n");
        for(int i = 9; i >= 2; i--) {
            System.out.printf("%d bottles of beer on the wall, %d bottles of beer.%n", i, i);
            System.out.println("Take one down, pass it around,");
        }
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
        System.out.println("Take one down, pass it around,");
        System.out.println("No more bottles of beer on the wall.");
    }
}