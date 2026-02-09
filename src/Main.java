import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        int n = 4;
        int[] arr = new int[n + 1];

        // 1~n만 초기화
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        // for문이 실제로 어디까지 도는지 출력
        for (int i : arr) {
            System.out.println("i = " + i + ", arr[i] = " + arr[i]);
        }

    }
}