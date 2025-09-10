package solvedAc.baekjoon.silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * 문제 풀이:
 * 플랫폼:
 * 제한시간: 30분
 *
 * 1. 문제 접근 아이디어
 *
 *
 * 2. solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
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
            check[prev - 'a'] = true;

            for (int j = 1; j < str.length(); j++) {
                char now = str.charAt(j);

                if (now != prev) {

                    if (check[now - 97] == false) {
                        check[now - 97] = true;
                        prev = now;
                    } else {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
