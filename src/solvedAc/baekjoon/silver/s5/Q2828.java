package solvedAc.baekjoon.silver.s5;

import java.util.Scanner;

/**
 * 제목: 사과 담기 게임
 * 문제 링크: https://www.acmicpc.net/problem/2828
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 13 + 11
 *
 * 1. 문제 풀이 전략
 *  바구니는 가장 좌측에서 시작한다.
 * 말그대로 y 칸 이동은 고려하지 않고
 * 직선으로 떨어지는 사과 위치에 바구니를 이동해야한다.
 * 사과 위치 - 바구니 위치의 합을 구한다.
 * 바구니 > 1 일때는 어떻게 되는거지?
 * 테스트 케이스 2를 보면 출력이 4인것을 보면 바구니를 같이 움직일 수 있는 듯
 *  for loop i<j
 *  사과 위치 - 바구니 갯수 의 합을 구한다.
 *2
 *  예외 케이스
 *
 *  반례
 *  6 2
 *
 * 3. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 4. 프로그래머스
 * solution(String s)메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 5. 이슈
 * 바구니의 현재 위치를 저장하지 않는 구조 바구니가 오른쪽에 있을때만 더해짐
 * 예를 들어 바구니는 현재 오른쪽에 이동했는데 사과가 왼쪽에 떨어지는 경우 해결 불가능
 *
 */
public class Q2828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int j = sc.nextInt();
        int distance = 0;
        int left=1;
        int right=m;
        for (int i = 0; i < j; i++) {
            int apple = sc.nextInt();
            if (left > apple ) { //왼쪽 이동
                distance += left - apple;
                right -= left-apple;
                left = apple;
            } else if (apple > right) { //오른쪽 이동
                distance += apple - right;
                left += apple - right;
                right = apple;
            }
        }
        System.out.println(distance);




    }
}
