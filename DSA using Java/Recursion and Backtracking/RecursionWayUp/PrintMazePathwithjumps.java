import java.util.*;

public class PrintMazePathwithjumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(1, 1, n, m, "");
        sc.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        for (int i = 1; i < dc; i++) {
            if (sc < dc) {
                printMazePaths(sr, sc + i, dr, dc, psf + "h" + i);
            }
        }

        for (int i = 1; i < dr; i++) {
            if (sr < dr) {
                printMazePaths(sr + i, sc, dr, dc, psf + "v" + i);
            }
        }

        for (int i = 1; i < dc && i < dr; i++) {
            if (sr < dr && sc < dc) {
                printMazePaths(sr + i, sc + i, dr, dc, psf + "d" + i);
            }
        }

    }

}