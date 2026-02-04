package solvedAc.baekjoon.sprout.Geometry1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 제목: 삼각형과 세변
 * 문제 링크: https://www.acmicpc.net/problem/5073
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 10
 *
 * 1. 문제 풀이 전략
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

public class Q5073 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        while (sc.hasNextLine()) {
            for (int i = 0; i < 3; i++) {
                array[i] = sc.nextInt();
            }
            if (array[0] == 0 && array[1] == 0 && array[2] == 0) break;

            array = Arrays.stream(array).sorted().toArray();

            if (array[2] < array[0] + array[1]) {
                if (array[0] == array[1] && array[1] == array[2] && array[0] == array[2]) {
                    System.out.println("Equilateral");
                } else if (array[0] == array[1] || array[1] == array[2] || array[2] == array[0]) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
