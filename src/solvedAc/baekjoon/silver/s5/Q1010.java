package solvedAc.baekjoon.silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * 제목: 다리놓기
 * 문제 링크:https://www.acmicpc.net/problem/1010
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간:
 *
 * 1. 문제 접근 아이디어
 * 서로 곂쳐지지 않게 지을 수 있는 다리의 갯수 구하기
 * 순열? 조합 쓰면 될 것 같은 느낌
 * 수정 - "곂쳐지지 않게"가 평행 다리가 아니라 크로스되는 다리를 의미함
 *
 * 2. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 3. 프로그래머스
 * solution(String s)메서드  사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 4. 이슈
 * 왜 조합일까?
 * N:13 M:29 오버 플로우 발생 > 순열 곱셈공식 전개 후 줄여지는 부분으로 재 정의
 */

public class Q1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            List<Integer> list = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

            Integer N = list.get(0);
            Integer M = list.get(1);
            //조합 공식 기억이 안남
//            long l = f(M) / (f(N) * f(M - N));
            long l = c(M, N);
            System.out.println(l);
        }
    }

    static long f(int n) {

        long result=1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static long c(int n, int r) {
        if (r>n-r) r = n - r;
        long result = 1;
        for (int i = 0; i < r; i++) {

            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}
