package programmars.lv1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 제목:자릿수 더하기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12931?language=java
 * 플랫폼:  프로그래머스
 * 제한시간: 30분
 * 소요시간:
 *
 * 1. 문제 접근 아이디어
 *  자연수 N의 각 자립수 의 합 구하기
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

public class AddingDigits {
    public static void main(String[] args) {
        System.out.println(solution(987));

    }
    public static int solution(int n) {
        int answer=0;
        String[] split = String.valueOf(n).split("");
        answer = Arrays.stream(split).mapToInt(Integer::parseInt).sum();

        return answer;
    }
}
