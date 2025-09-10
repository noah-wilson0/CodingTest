package solvedAc.baekjoon.silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1316
 */
public class Q1316 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count=N;

        for (int i = 0; i < N; i++) {
            boolean[] check = new boolean[26];
            String str = br.readLine();
            char prev = str.charAt(0);

            for (int j = 0; j < str.length(); j++) {
                char now = str.charAt(j);

                if (now != prev) {

                    if (check[now - 97] == false) {
                        check[now - 97] = true;
                        prev = now;
                    } else {
                        System.out.println(str);
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
