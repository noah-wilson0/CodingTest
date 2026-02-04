package solvedAc.baekjoon.sprout.string;

import java.io.IOException;
import java.util.Scanner;

/**
 * 제목: 세로 읽기
 * 문제 링크: https://www.acmicpc.net/problem/10798
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 9
 *
 * 1. 문제 풀이 전략
 * 시간 제한 1초
 * 빈칸없이 주어지는 입력받은 글자를 2차원 배열에 대입하여 세로로 읽기
 * Scanner.nextLine()을 split하거나 chacrAt으로 배열에 하나씩 추가한다.
 * MaxCol, BufferReader
 *2
 *  정상 케이스
 * ABCDE
 * abcde
 * 01234
 * FGHIJ
 * fghij
 *  예외 케이스
 *
 *  엣지 케이스
 * A
 * B
 * C
 * D
 * E
 * StringIndexOutOfBoundsException 발생 가능성
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
/*
public class Q10798 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[][] map = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < s.length(); j++) {
                map[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (map[j][i] !='\0' ) {
                    System.out.print(map[j][i]);
                }
            }
        }
        sc.close();
    }
}

 */
public class Q10798 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();

        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (i<arr[j].length()) {
                    System.out.print(arr[j].charAt(i));
                }
            }
        }
        sc.close();
    }
}
