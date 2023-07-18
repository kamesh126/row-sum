
import java.util.Arrays;
import java.util.Scanner;
class Coloum {
    public static int[] Colums(int A[][], int n, int m) {
        int ar[] = new int[m];
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + A[i][j];
            }
            ar[i] = sum;
        }
        return ar;
    }
}
public class RowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("row size ");
        int n = sc.nextInt();
        System.out.println("coloum size ");
        int m = sc.nextInt();
        int A[][] = new int[n][m];
        int coloumSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter " + i + " enter " + j);
                A[i][j] = sc.nextInt();
            }
        }
        int value[]= Coloum.Colums(A,n,m);
        System.out.println(Arrays.toString(value));

    }
}