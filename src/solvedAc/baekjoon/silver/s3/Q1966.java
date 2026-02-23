package solvedAc.baekjoon.silver.s3;

import java.util.*;

/**
 * 제목: 프린터 큐
 * 문제 링크: https://www.acmicpc.net/problem/1966
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 34
 *
 * 1. 문제 풀이 전략
 *  중요도에 따라 큐를 조절하여  큐의 M(0<=M<N)위치 문서가 몇번째(1~N)로 출력되는지 출력하기
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
 * 어떻게 우선순위를 판별하는게 pq를 쓰면 편한것을 몰랏음
 * q와 pq를 결합하여 풀었으면 쉬웟는데 몰라서 좀 걸렸지만
 * 문제자체는 쉬웠음
 *
 */
public class Q1966 {

    static class Node {
        int idx;
        int priority;

        public Node(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Node> queue = new LinkedList();
        PriorityQueue<Node> pq = new PriorityQueue<>(
                (a,b) -> Integer.compare( b.priority, a.priority));
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int priority = sc.nextInt();
                queue.offer(new Node(j, priority));

                pq.offer(new Node(j, priority));
            }
            int idx = 0;
            while (!queue.isEmpty()) {
                Node poll = queue.poll();
                Node peek = pq.peek();
                if (poll.priority < peek.priority) {
                    queue.offer(poll);
                    continue;
                }
                pq.poll();
                idx++;
                if (poll.idx == m) {
                    System.out.println(idx);
                    break;
                }
            }
            queue.clear();
            pq.clear();
        }

    }
}
