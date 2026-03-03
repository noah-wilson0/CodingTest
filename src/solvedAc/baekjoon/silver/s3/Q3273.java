package solvedAc.baekjoon.silver.s3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 제목: 두 수의 합
 * 문제 링크: https://www.acmicpc.net/problem/3273
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 48~58
 *
 * 1. 문제 풀이 전략
 * 투 포인터를 이용하여 ai~aj=x인 쌍의 갯수를 출력한다.
 * sum은 right와 더했을때 sum>x라면 right++
 * sum은 right와 더했을때 sum<x라면 left ++ => 보류: right의 모든 값을 순회 하기 전에 배제하면 안됨
 * right>n이 되면 right=left+1 부터 left++후 다시 시작
 *
 * 쌍을 찾으면 result++
 *
 *
 * 10 +3, 11+2, 12+1,
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
 * 1~1000_000이니깐 시간 초과 해결해야 함
 *
 * 투포인터 알고리즘대로 코딩하지 못한이유:
 *  left, right로 두가지 포인터를 활용하려고 할 때 비정렬 배열을 가지고 문제를 해결하려 했으므로
 *  정렬 안된 순서로 left+right > x, left+right > x 인 상황에 두 포인터를 조절하려고 하면
 *  당연히 중간에 break할 수 없는 상황이 오므로 투 포인터로 해결하려 했지만 그렇게 결과가 나올 수 없었고
 *  단순 2중 loop로 결과가 나왔다.
 *
 */
public class Q3273 {
    public static void main(String[] args) {
        //1차 시도
       /* Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int left = 0;
        int result = 0;
        while (left < n) {

            for (int right = left + 1; right < n; right++) {
                int sum = array[left] + array[right];
                if (sum == x) result++;
            }
            left++;
        }
        System.out.println(result);*/
        //2차 시도
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        Arrays.sort(array);

        int left = 0;
        int right = n-1;
        int result = 0;
        while (left < right) {
            int sum = array[left] + array[right];

            if (sum == x) {
                result++;
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
