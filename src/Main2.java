import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //2-19복습
        //7568
        // 34~46 = 12분
        // 문제의도와 다르게 w또는 h가 같을때 h 또는 w가 클때도 +해줘서 1회 틀렸엇다.
        /*Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        int[][] array = new int[t][2];
        for (int i = 0; i < t; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            array[i][0] = w;
            array[i][1] = h;
        }
        for (int i = 0; i < t; i++) {
            int w = array[i][0];
            int h = array[i][1];
            int j = 0;
            int cnt = 0;
            while (j < t) {
                int w2 = array[j][0];
                int h2 = array[j][1];
                if (w2 > w && h2 > h) {
                    cnt++;
                }
                j++;
            }
            sb.append((cnt + 1) + " ");

        }
        System.out.println(sb);*/
        //2167
        //16~24
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arrays = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arrays[i][j] = sc.nextInt();
            }
        }

        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = 0;
            for (int l = i; l <= x; l++) {
                for (int o = j; o <= y; o++) {
                    sum += arrays[l][o];
                }
            }
            System.out.println(sum);
        }

    }


}
