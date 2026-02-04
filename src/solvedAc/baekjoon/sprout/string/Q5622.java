package solvedAc.baekjoon.sprout.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 제목: 다이얼
 * 문제 링크: https://www.acmicpc.net/problem/5622
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 10
 *
 * 1. 문제 풀이 전략
 *  숫자 1~0까지 걸리는 시간은 2~11초이다.
 *  7과 9를 제외한 숫자는 A부터 연속적인 알파벳 3개로 매핑된다.
 *  => 2차별 배열로 직접 매핑 값을 대입해야 하나?
 *  그럼 1,0은 뭐지? 입력은 반드시 문자이므로 사용되지 않는다.
 *2. 반례
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

public class Q5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            switch (c) {
                case 'A': case 'B': case 'C':
                    sum += 3;
                    break;
                case 'D': case 'E': case 'F':
                    sum += 4;
                    break;
                case 'G': case 'H': case 'I':
                    sum += 5;
                    break;
                case 'J': case 'K': case 'L':
                    sum += 6;
                    break;
                case 'M': case 'N': case 'O':
                    sum += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    sum += 8;
                    break;
                case 'T': case 'U': case 'V':
                    sum += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    sum += 10;
                    break;
            }
        }

        System.out.println(sum);


    }
}
