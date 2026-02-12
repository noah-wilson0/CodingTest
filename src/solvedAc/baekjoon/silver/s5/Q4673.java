package solvedAc.baekjoon.silver.s5;

/**
 * 제목: 셀프 넘버
 * 문제 링크: https://www.acmicpc.net/problem/4673
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 32~54
 *
 * 1. 문제 풀이 전략
 *  생성자가 있는 숫자는 break;
 *  없는 숫자는 출력 10000까지
 *  for loop
 *  
 *   1~1000까지 루프를 돌며 무한 수열을 통해 셀프 넘버 인 수를 출력한다.
 *   루프를 돌며 셀프 넘버인지 아닌지는 boolean[]을 통해 체크한다.
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
 * 제출하면 런타임 에러 뜸 main class Main
 * 실수로 패키지 줄 안지웠음
 *
 */
public class Q4673 {
    public static void main(String[] args) {
/*        boolean[] booleans = new boolean[10000+1];
        for (int i = 1; i <= 10000; i++) {
            String[] s = String.valueOf(i).split("");
            int num=i;

            for (int j = 0; j < s.length; j++) { //자릿수 합
                num += Integer.valueOf(s[j]);
            }
            if (num < 10000 + 1) {
                booleans[num] = true;
            }
            if (!booleans[i]) {
                System.out.println(i);
            }

        }*/
        //풀이 2
        boolean[] generated = new boolean[10001];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            int num = d(i);
            if (num <= 10000) {
                generated[num] = true;
            }
            if (!generated[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.print(sb);

    }
    static int d(int n) {
        int sum = n;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

}
