package solvedAc.baekjoon.sprout.math;

import java.util.Scanner;

/**
 * 제목: 분수찾기
 * 문제 링크: https://www.acmicpc.net/problem/1193
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 50
 *
 * 1. 문제 풀이 전략
 *  분수들이 1/1, 1/2, 2/1 ... 지그재그 순서로 이루어져 있다.
 * X번쨰 분수를 출력한다.
 *
 *  대각 분수 갯수 1, 2, 3, 4 ...
 *  2오 3왼 4오 5왼... 짝수는 오른쪽부터 홀수는 왼쪽부터  조건문
 *
 *  오시작은 1~n +/n~1 -
 *  왼시작은 n~1 -/1~n +
 *
 *  n의 값은 어떻게 정의해야 하는가?
 *  대각 범위 1,2,3,4,5,6...
 *  총량으로 따지면 1,3,6,10....
 *  => 공차가 1인 등차수열 합 공식 n(n+1)/2
 *  n이 어느 대각 위치 x에 존재하는지   n(n+1)/2>=x인 경우이다.
 *
 *  그럼 대각의 몇번쨰 위치일까?
 *  n이 홀짝에 따라  분모/분자를 +-하여 확인가능
 *
 *
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
 * 1. 총 분수 수 - 필요없는 분수 수를 할 필요가 없다.
 *  cross에 대한 현재 갯수만 알면 된다.
 *  numberator/deminator number는 현재 위치 x-prev_sum 과 cross_count - 현재 위치+1 이다.
 *
 */

public class Q1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        int x = sc.nextInt(); //1

        int n = 1;
        int sum = 0;
        int pos;
        int numerator; //분자
        int denominator; //분모
        while (sum < x) {  //0< 1
            sum = n * (n + 1) / 2; //sum=1 n=2
            n++;
        }
        n--;
        System.out.println("n = " + n);
        int prev = n * (n -1) / 2; //prev=1
        System.out.println("prev = " + prev);
        pos = x - prev; //sum-prev을 하여 현재 x의 위치를 찾는다. //pos=0
        if (n % 2 == 0) {
            System.out.println("짝 = ");
            numerator = pos;
            denominator = n-pos+1;
            System.out.println(String.format("%d/%d", numerator, denominator));
        } else {
            numerator = n-pos+1;
            denominator = pos;
            System.out.println(String.format("%d/%d", numerator, denominator));

        }
*/
        int x = sc.nextInt();

        int cross_count = 1;
        int prev_sum = 0;
        int numerator;
        int denominator;
        while (true) {
            if (x <= prev_sum + cross_count) {
                int pos = x - prev_sum; //해당 대각선의 현재 위치
                if (cross_count % 2 == 0) {
                    numerator = pos;
                    denominator = cross_count - pos + 1;

                } else {
                    numerator = cross_count - pos + 1;
                    denominator = pos;
                }
                System.out.println(String.format("%d/%d", numerator, denominator));
                break;
            } else {
                prev_sum += cross_count;
                cross_count++;
            }

        }



    }
}
