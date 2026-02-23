package solvedAc.baekjoon.silver.s2;

import java.util.Scanner;

/**
 * 제목: 사탕게임
 * 문제 링크: https://www.acmicpc.net/problem/3085
 * 플랫폼: 백준
 * 제한시간: 40
 * 소요시간: 1037
 *
 * 1. 문제 풀이 전략
 *  사탕의 색이 다른 인접한 두칸의 사탕을 교환할 수 있다.
 *  위 교환을 반복한 후 가장 긴 연속 부분(행또는 열)의 최대값을 구해야 한다.
 *
 *  그냥 교환이 아니라 가장 긴 연속 부분이 될 수 있는 부분을 교환해야한다.
 *  2차원 배열에서 어떻게 할 수 있을까?
 *  1. 가장 긴열이 될 후보 파악
 *  1-1. 교환전 가장긴 연속적인 부분 후보 파악
 *  1-2. 교환 후 가장 연속 적인 길이 저장 및 비교
 *  2. 후보열 또는 행의 교환가능한 부분 교환하기
 *  3. 출력
 *
 * 다르게 생각해보자
 * loop마다 교환 전 연속 적인 부분의 인접한 부분이 equals하다면
 * 길이를 더해가며 끝까지의 길이를 저장 및 비교하여 가장 긴 길이를 최종 저장한다.
 * 행,열 별로 따로 loop를 돌아본다.
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
 * 교환은 1회만 가능한 것 같다.
 * 현재 로직은 모든 행/열에서 교환했을때 가능한 길이만큼 더하는 방식
 *
 *
 */
public class Q3085 {
    static int n;
    static char[][] board;
    static int ans = 1;

    static void swap(int x1, int y1, int x2, int y2) {
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    static void checkRow(int row) {
        int max = 1;
        int cur = 1;
        char prev = board[row][1];

        for (int j = 2; j < n; j++) {
            if (board[row][j] == prev) {
                cur++;
                if (cur > max) max = cur;
            } else {
                prev = board[row][j];
                cur = 1;
            }
        }
        ans = Math.max(ans, max);
    }

    static void checkCol(int col) {
        int max = 1;
        int cur = 1;
        char prev = board[1][col];

        for (int i = 2; i < n; i++) {
            if (board[i][col] == prev) {
                cur++;
                if (cur > max) max = cur;
            } else {
                prev = board[i][col];
                cur = 1;
            }
        }
        ans = Math.max(ans, max);
    }


    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isSwap = false;
        Character[][] board=new Character[n][n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < s.length(); j++) {
                board[i][j] = s.charAt(j);
            }
        }
        int maxSameColorLength=1;
        int sameColorLength=1;


        //가장 긴 행 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = j;
                char curColor = board[i][k];
                while (++k < n) {
                    if (!isSwap && curColor == board[i][k]) { //우
                        sameColorLength++;
                    } else if (!isSwap && i - 1 > 0 && curColor == board[i - 1][k]) { //상
                        sameColorLength++;
                    } else if (!isSwap && i + 1 < n && curColor == board[i + 1][k]) { //하
                        sameColorLength++;
                    } else {
                        break;
                    }
                }
                maxSameColorLength = Math.max(maxSameColorLength, sameColorLength);
                sameColorLength = 1;
            }
        }

        //가장 긴 열 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = j;
                char curColor = board[k][i];
                while (++k < n) {
                    if (!isSwap && curColor == board[k][i]) { //우
                        sameColorLength++;
                    } else if (!isSwap && k - 1 > 0 && curColor == board[k - 1][i]) { //상
                        sameColorLength++;
                    } else if (!isSwap && k + 1 < n && curColor == board[k + 1][i]) { //하
                        sameColorLength++;
                    } else {
                        break;

                    }
                }
                maxSameColorLength = Math.max(maxSameColorLength, sameColorLength);
                sameColorLength = 1;
            }
        }
        System.out.println(maxSameColorLength);*/

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt() + 1;
        board = new char[n][n];

        for (int i = 1; i < n; i++) {
            String s = sc.next();
            for (int j = 1; j < n; j++) {
                board[i][j] = s.charAt(j - 1);
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {

                if (j < n - 1) {
                    swap(i, j, i, j + 1);
                    checkRow(i);
                    checkCol(j);
                    checkCol(j + 1);
                    swap(i, j, i, j + 1);
                }

                if (i < n - 1) {
                    swap(i, j, i + 1, j);
                    checkCol(j);
                    checkRow(i);
                    checkRow(i + 1);
                    swap(i, j, i + 1, j);
                }
            }
        }

        System.out.println(ans);
    }
}
