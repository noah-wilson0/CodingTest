package solvedAc.baekjoon.silver.s3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 제목: 체스판 다시 칠하기
 * 문제 링크: https://www.acmicpc.net/problem/1018
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 25+28 문제 이해만  39~55
 *
 * 1. 문제 풀이 전략
 * 1. 예제1을 만족하는 다시 칠해야될 정사각형의 갯수 찾기
 * start color 가 번갈아 지려면  i가 홀짝일때
 * start block이 w/b에 따라 w/b, b/w로 나뉜다.
 * 2차원 String 배열 사용
 * start color 파악, line start color 파악
 *
 * 2. M,N > 8 일 경우 다시 칠해야될 정사각형 갯수가 최소인 위치 찾는 방법?
 * ------- 까지 파악 완료 ------
 * 파악하지 못햇던 것 https://st-lab.tistory.com/101 참고
 * 경우의 수는 (n-7) x (m-7)이다.
 * 맨 위쪽 왼쪽 칸이 W/B인 경우 2가지 존재한다.(입력 값 기준으로 정해지는게 아님)
 * 모든 경우의 수 = 2x (n-7) x (m-7) 이다.
 * W/B 경우의 수는 W 경우의수 와 64 - W 경우의 수로 2가지이다.
 * 2차원 boolean 배열 사용 으로 더 쉽게 W/B비교 가능하게 변경
 * start color , line start color 는 boolean currentColor로 통일하여
 * i loop 변경시 currentColor=!currentColor로 라인별 시작 반대색이 적용되게 한다.
 * j loop 변경시 currentColor=!currentColor로 반대색이 되게 한다.
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
public class Q1018 {
    static Boolean[][] map;
    static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        map = new Boolean[n][m];


        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == 'W') {
                    map[i][j] = true;
                } else {
                    map[i][j] = false;
                }
            }
        }

        int nRow = n - 7;
        int mCol = m - 7;
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < mCol; j++) {
                find( i, j);
            }
        }
        System.out.println(min);
    }

    private static int find(int i, int j) {
        int x = i + 8;
        int y = j + 8;
        int wCnt = 0;

        Boolean currentColor = map[i][j];

        for (int k = i; k < x; k++) {
            for (int l = j; l < y; l++) {

                if (map[k][l] != currentColor) {
                    wCnt++;
                }
                currentColor = !currentColor;
            }
            currentColor = !currentColor;
        }

        int cnt = Math.min(wCnt, 64 - wCnt);
        min = Math.min(min, cnt);
        return min;
    }

}
