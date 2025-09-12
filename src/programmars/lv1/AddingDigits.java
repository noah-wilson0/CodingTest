package programmars.lv1;

import java.util.Arrays;

/**
 * 제목:자릿수 더하기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12931?language=java
 * 플랫폼:  프로그래머스
 * 제한시간: 30분
 * 소요시간: 3분
 *
 * 1. 문제 접근 아이디어
 *  자연수 N의 각 자립수 의 합 구하기
 *
 * 2. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 3. 프로그래머스
 * solution(String s)메서드  사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 *    나도 N 나누기로 자릿수 합을 구현하려고 했는데
 *    N을 다시 저장해야되니깐 string이 더 효율적이라고 생각 했었는데
 *    import java.util.*;
 *
 * public class Solution {
 *     public int solution(int n) {
 *         int answer = 0;
 *
 *         while(true){
 *             answer+=n%10;
 *             if(n<10)
 *                 break;
 *
 *             n=n/10;
 *         }
 *
 *         // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
 *         System.out.println("Hello Java");
 *         return answer;
 *     }
 *
 * }
 * 이렇게 풀어 지는 사람이 존재했다.
 * 좀 더 생각해서 로직까지 머리속으로 생각해봣으면 똑같이 풀었을 것 같은데 아쉽다.
 *
 */

public class AddingDigits {
    public static void main(String[] args) {
        System.out.println(solution(987));

    }
    public static int solution(int n) {
        int answer=0;
        String[] split = String.valueOf(n).split("");
        answer = Arrays.stream(split).mapToInt(Integer::parseInt).sum();

        return answer;
    }
}
