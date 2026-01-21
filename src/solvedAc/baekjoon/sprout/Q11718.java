package solvedAc.baekjoon.sprout;

import java.io.IOException;
import java.util.Scanner;

/**
 * 제목: 그대로 출력하기
 * 문제 링크: https://www.acmicpc.net/problem/11718
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 48분
 *
 * 1. 문제 풀이 전략
 * 그냥 출력하면 된다.
 * 공백으로 시작하지않고 끝나지 않는다.
 *  빈줄은 없다.
 *  근데 정답 비율이 너무 낮아서 의심 된다.
 *2
 *  정상 케이스 
 *  "Hello"
 * "Baekjoon"
 * "Online Judge"
 *  예외 케이스
 * 모름
 *  엣지 케이스
 * 모름
 * 3. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 4. 프로그래머스
 * solution(String s)메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 5. 이슈
 * 
 * 
 */

public class Q11718 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
