package solvedAc.baekjoon.silver.s2;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 제목: 과일 탕후루
 * 문제 링크: https://www.acmicpc.net/problem/30804
 * 플랫폼: 백준
 * 제한시간: 30초과
 * 소요시간:
 *
 * 1. 문제 풀이 전략
 *  1~9의 과일 종류가 있다.
 *  S1~SN까지의 숫자 스트림을 만들 수 있다.
 *  과일의 종류가 2개 이하여야 한다.
 *  과일의 종류<=2를 만족하기 위해 Sa+1~Sn-b번 숫자 스트림의 갯수의 합을 구해야한다.
 *  갯수가 가장 많은 과일의 갯수를 구해야한다.
 *  제약 사항
 *  숫자는 앞/뒤로 뺼 수 있다. => Dequeue?
 *  모든 경우의 수에서 갯수가 가장 많은 숫자 스트림을 구해야한다.
 *
 *  Node(idx(0~N),num(1~9))
 *  Deque<Node>
 *  loop
 *      deque.copy
 *      deque.
 *
 * element를 1개씩 제거해 나가며 과일 종류가 2개 이하일때 길이를 비교 저장
 * 2종류인지 파악 방법
 * element1 poll 후 not equals  elemet2 poll ~ elementN poll까지의 길이 합
 *
 *
 *  s1~sn까지 숫자 스트림에서  Deque<Integer>  사용
 *  앞에서 뺏을때 뒤에서 뺏을때 과일 두종류가 되면 길이 구하기
 *  앞, 뒤 모두 뻇을때 과일 두종류가 되면 길이 구하기
 *  3번의 경우의 수가 존재하며 시행 후 복구도 해줘야 한다.
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
 * 반대로 생각을 해야한다.
 * Map을 쓰지않은 이유는 Map은 중복을 허용하지 않기 때문에 제대로 길이를 셀수 없기에 입력 받은 숫자 스트림을 Map에 저장할 수 없다고 판단.
 * 하지만 반대로 2종류인지 파악을 위해 검증  Map을 사용할 수 있다.
 * Map<fruit, size> 를 사용하여 Map.size()>2이면 2종류 이상이다.
 * j=i++ >N 까지 반복하며
 * Map.size()<2 일떄까지 길이를 체크해나간다.
 *
 * 두 포인터 문제를 처음 봐서 해맨게 크다.
 */
public class Q30804 {

    static int maxLength = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            array[i] = num;
        }
        int i = 0;
        for (int j = 0; j < n; j++) {
            map.put(array[j], map.getOrDefault(array[j], 0) + 1);

            while (map.size() > 2) {
                map.put(array[i], map.get(array[i]) - 1);
                if (map.get(array[i]) == 0) {
                    map.remove(array[i]);
                }
                i++;
            }
            max = Math.max(max, j - i + 1);

        }
        System.out.println(max);
    }
}
