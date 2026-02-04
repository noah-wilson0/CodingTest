package solvedAc.baekjoon.sprout.Geometry1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 제목: 세 막대
 * 문제 링크: https://www.acmicpc.net/problem/14215
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 5
 *
 * 1. 문제 풀이 전략
 * 삼각형의 공식 a+ b < c
 * 막대의 길이는 수정할 수 있으므로 삼각형이 되지않는 다면 임의로 조정 가능
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

public class Q14125 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= new int[3];

        array[0]=sc.nextInt();
        array[1]=sc.nextInt();
        array[2]=sc.nextInt();

        Arrays.sort(array);

        if (array[2] >= array[0] + array[1]) {
            array[2]=array[0] + array[1] - 1;
        }
        System.out.println(array[0] + array[1] + array[2]);

    }
}
