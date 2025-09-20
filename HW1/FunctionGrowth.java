import java.util.Scanner;

public class FunctionGrowth {
    /**  Print out ln n, n, n log n, n^2, n^3 for n = 2, 4, 8, ..., 2048.*/
    public static void main(String args[]) {
        System.out.println("Log(n) \t n \t n*Log(n) \t n^2 \t n^3");
        for(int i = 2; i <= 2048; i *=2){
            System.out.print((int) Math.log(i));
            System.out.print('\t');
            System.out.print(i);
            System.out.print((int)(i*Math.log(i)));
            System.out.print('\t');
            System.out.print(Math.pow(i,2));
            System.out.print('\t');
            System.out.print(Math.pow(i,3));
            System.out.print('\n');
        }

    }
}
