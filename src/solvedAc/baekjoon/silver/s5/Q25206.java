package solvedAc.baekjoon.silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 제목: 너의 평점은
 * 문제 링크: https://www.acmicpc.net/problem/25206
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간: 20분
 *
 * 1. 문제 접근 아이디어
 * (학점 x 과목 평점)의 합을 구한 후 학점의 총합으로 나누어 전공 평점을 구해야 한다.
 *
 * 2. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 3. 프로그래머스
 * solution(String s)메서드  사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 */

public class Q25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> graph = new HashMap<>();
        graph.put("A+", 4.5);
        graph.put("A0", 4.0);
        graph.put("B+", 3.5);
        graph.put("B0", 3.0);
        graph.put("C+", 2.5);
        graph.put("C0", 2.0);
        graph.put("D+", 1.5);
        graph.put("D0", 1.0);
        graph.put("F", 0.0);

        double result=0;
        double majorSum=0;
        double haksum=0;

        for (int i = 0; i < 20; i++) {
            String[] split = br.readLine().split(" ");
            if (!split[2].equals("P")) {
                majorSum += Double.parseDouble(split[1]) * graph.get(split[2]);
                haksum += Double.parseDouble(split[1]);
            }

        }
        result = majorSum / haksum;
        System.out.println(String.format("%.6f",result));

    }
}
