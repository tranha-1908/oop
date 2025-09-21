import java.util.Scanner;


public class SpiralWalk{

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int steps = 0;
        int stepSize = 1;
        int k = 0;
        int dir = 0; // 0=right,1=down,2=left,3=up
        // dung mang huong de xac dinh huong di chuyen
        // (1,0) = right
        // (0,-1) = down
        // (-1,0) = left
        // (0,1) = up
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        while (Math.abs(x) <= n && Math.abs(y) <= n) {
            StdDraw.setPenColor( new java.awt.Color(255 - stepSize, stepSize * 2,100));
            StdDraw.filledSquare(x, y, 0.45);

            x += dx[dir];
            y += dy[dir];
            k++;
            if (k == stepSize) {
                k = 0;
                dir = (dir + 1) % 4;
                if (dir == 0 || dir == 2) stepSize++;
            }
            steps++;
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledSquare(x, y, 0.45);
            StdDraw.show();
            StdDraw.pause(2);
        }
        StdOut.println("Total steps = " + steps);
    }

}

