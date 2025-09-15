package programmars.lv0;

import java.util.Arrays;

/**
 * 제목: a와 b출려하기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181951
 * 플랫폼: 프로그래머스
 * 제한시간: 30분
 * 소요시간: 1분
 *
 * 1. 문제 접근 아이디어
 *
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
 *
 */

public class AandBPrint {
    public static void main(String[] args) {
        solution("4 5");

    }
    public static void solution(String n) {

        String[] split = n.split(" ");

        System.out.println("a = " + split[0]);
        System.out.println("b = " + split[1]);

    }
}
