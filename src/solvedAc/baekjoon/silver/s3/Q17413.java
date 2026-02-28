package solvedAc.baekjoon.silver.s3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * 제목: 단어 뒤집기 2
 * 문제 링크: https://www.acmicpc.net/problem/17413
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간:34
 *
 * 1. 문제 풀이 전략
 *  단어만 뒤집는다.
 *  태그(<>) 와 공백(' ')은 뒤집지 않는다.
 *  StringBuilder사용
 *  1. input string 을 split(" ")한다
 *  2. ""일때는 sb.append(" ")을 한다.
 *  3. '<'일때는 '>'가 나올떄까지 sb.append()한다.
 *  4. 단어일때는 stack에 한 글자식추가하여 while loop를 돌며 뒤집어서 출력한다.
 *  5.2-4를 반복한다.
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
 * 위 2-4방식대로하면 <>word<> 인 상황에 문제가 생기므로 charAt()과 stack을 이용해야 함
 *
 */
public class Q17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='<') {
                while (true) {
                    while (!stack.isEmpty()) sb.append(stack.pop());
                    char next = s.charAt(i);
                    sb.append(next);
                    if (next == '>') break;
                    i++;
                }

            } else if(c==' ') {
                while (!stack.isEmpty()) sb.append(stack.pop());
                sb.append(' ');
            }else{
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb);
    }
}
