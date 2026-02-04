package solvedAc.baekjoon.sprout.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 제목: 알파벳 찾기
 * 문제 링크: https://www.acmicpc.net/problem/10809
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간: 8 + 9
 *
 * 1. 문제 접근 아이디어
 *  z-a 만큼 loop를 돌며 입력에 대한 a~z의 등장 위치를 공백으로 구분하여 출력한다.
 *  array=z-a크기의 배열을 선언하고 -1로 초기화한다.
 *  이떄 i는 a~z까지 순회하는 알파벳과 같은 역할을 하게 된다.
 *  array.charAt(i)에 해당하는 배열은 각 알파벳의 위치로 인덱스 번호를 저장한다.
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
 * 1. charAt을 할 i 값은 s > t 이므로  StringIndexOutOfBoundsException 이다.
 * 2. Arrays.fill()을 할 줄 몰랏음
 */

public class Q10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] a=new int['z'-'a'+1];
        Arrays.fill(a, -1);
        for (int i = 0; i < s.length(); i++) {
            int id = s.charAt(i) - 'a';
            if (a[id] == -1) a[id] = i;
        }
        for (int i : a) {
            System.out.print(i+" ");
        }

        //10809 2026-01-22복습 완 5분 +5분소비
        //이슈: 'z'-'a'=25이지만  이떄'a'는 0이다. 즉 0~25로 계산된다. 그러므로 알파벳은 26자이다.
        /*int[] arr=new int[26];
        Arrays.fill(arr, -1);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (arr[c-'a']==-1){
                arr[c -'a']=i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }*/

    }
}
