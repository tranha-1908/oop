import java.util.Scanner;

public class Transpose {
    public static void printArray (int arr[][], int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr, n);
        System.out.println("Transpose matrix");
        for(int i=0; i<n; i++){
            for(int j= i; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printArray(arr, n);
    }
}
