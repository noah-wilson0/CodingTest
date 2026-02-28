package solvedAc.baekjoon.silver.s2;

import java.util.Scanner;

/**
 * 제목: 참외 밭
 * 문제 링크: https://www.acmicpc.net/problem/2477
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 26
 *
 * 1. 문제 풀이 전략
 * 입력 받은 밭의 면적을 구해야한다.
 * 면적을 어떻게 구해야 되지?
 *  입력받은  동(1) 합 == 서(2) 합 이다.
 *   남(3) == 북(4)  이다.
 *   위 두 값을 곱하면 총 면적을 구할 수 있다.
 *   => 밭은 항상  동서 방향이거나 남북 방향이다.
 *   ==> 하지만  예시와 같이  육각형이 항상 일정하게 한 부분만 그렇지 않고 "T"와 같이 생긴 밭인 경우가
 *   ==> 있을 수 있으므로 위와 같은 방식은 불가능
 *
 * => 참외밭의 모양이 "T"같은건 없고 ㄱ 모양을 90, 180, 270도 회전한 모양만 나온다.
 * 입력 받은 방향에서
 * 1,2 방향의 입력 값 >1인 변 중에서 가장 작은 값 * 3,4방향의 입력 값 > 1 중의 가장 작은 값을
 * 1,2 방향의 입력 값 >1인 변 중에서 가장 큰 값 * 3,4방향의 입력 값 > 1 중의 가장 큰 값으로 빼면 면적 값이다.
 *
 * 면적값 * m^2당 참외 갯수 = result
 *
 *
 *2
 *  예외 케이스
 *
 *  반례
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
 *
 *
 */
public class Q2477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mePerCount = sc.nextInt();

        int[] len = new int[6];

        int maxW = 0;
        int maxH = 0;
        int idxW = -1;
        int idxH = -1;

        for (int i = 0; i < 6; i++) {
            int dir = sc.nextInt();
            len[i] = sc.nextInt();

            if (dir == 1 || dir == 2) {
                if (len[i] > maxW) {
                    maxW = len[i];
                    idxW = i;
                }
            } else {
                if (len[i] > maxH) {
                    maxH = len[i];
                    idxH = i;
                }
            }
        }

        int smallW = Math.abs(len[(idxW + 5) % 6] - len[(idxW + 1) % 6]);
        int smallH = Math.abs(len[(idxH + 5) % 6] - len[(idxH + 1) % 6]);

        int area = (maxW * maxH) - (smallW * smallH);
        System.out.println(area * mePerCount);

        sc.close();
    }
}
