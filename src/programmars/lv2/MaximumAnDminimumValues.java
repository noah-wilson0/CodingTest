package programmars.lv2;

/**
 * 제목: 최댓값과 최솟값
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java
 * 플랫폼: 프로그래머스
 * 제한시간: 30분
 * 소요시간: 12분
 *
 * 1. 문제 접근 아이디어
 * 문자열 S에 나타나는 숫자 중 최댓값과 최솟값을 찾아 "(최솟값) (최댓값)" 형태로 반환하기
 *
 * 2. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 3. 프로그래머스
 * solution(String s)메서드  사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 */


public class MaximumAnDminimumValues {
    public static void main(String[] args) {

        System.out.println(solution("1 2 3 4"));
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(solution("-1 -1"));
    }

    public static String solution(String s) {
        String answer = "";

        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;

        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            int n = Integer.parseInt(split[i]);

            if (n > maximum) {
                maximum = n;
            }
            if (n < minimum) {
                minimum=n;
            }
        }
        answer = String.format("%d %d", minimum, maximum);  //String format하는 방법 잘 기억이 안낫음  String.format() 또는 minimum + " " + maximum 사용 가능
        return answer;
    }

}
