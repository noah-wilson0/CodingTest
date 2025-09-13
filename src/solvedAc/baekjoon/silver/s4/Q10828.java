package solvedAc.baekjoon.silver.s4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 제목:스택
 * 문제 링크: https://www.acmicpc.net/problem/10828
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간: 17분
 *
 * 1. 문제 접근 아이디어
 * 주어진 스택 명령어 5가지를 수행한 결과를 출력한다.
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
 * Stack을 상속받아서 stack class자체를 수정할지 고민을 했음
 */
public class Q10828 {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.startsWith("push")) {
                push(s);
            } else if (s.equals("pop")) {
                System.out.println(pop());
            } else if (s.equals("size")) {
                System.out.println(size());
            } else if (s.equals("empty")) {
                System.out.println(empty());
            } else if (s.equals("top")) {
                System.out.println(top());
            }


        }

    }
    public static void push(String s) {
        String[] split = s.split(" ");
        stack.push(Integer.valueOf(split[1]));
    }

    public static int pop() {

        if (stack.isEmpty()) {
            return -1;
        }
        return stack.pop();
    }

    public static int size() {
        return stack.size();
    }

    public static int empty() {
        return stack.isEmpty() ? 1 : 0;
    }

    public static int top() {
        return stack.isEmpty() ? -1 : stack.peek();
    }

}
