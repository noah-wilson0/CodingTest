package solvedAc.baekjoon.Bronze.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 제목: 알파벳 찾기ㅅ
 * 문제 링크: https://www.acmicpc.net/problem/10809
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간: 14분 30초
 *
 * 1. 문제 접근 아이디어
 * 단어 S에 대해서 알파벳 a~z의 등장 위치를 출력한다.
 * 포함되지 않는 알파벳은 -1, 첫 번째 위치는 0이다.
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
 * 배열 초기화 미숙지
 * 처음 등장하는 위치만 저장해야 된다.
 */

public class Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1); //초기화 하는 방법 미숙지

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alphabet[c - 'a'] == -1) {
                alphabet[c - 'a']=i;
            }
        }
        Arrays.stream(alphabet).forEach(a -> System.out.print(a + " "));
    }

}
