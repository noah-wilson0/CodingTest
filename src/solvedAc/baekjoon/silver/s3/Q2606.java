package solvedAc.baekjoon.silver.s3;

import java.util.*;

/**
 * 제목: 바이러스
 * 문제 링크: https://www.acmicpc.net/problem/2606
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 16
 *
 * 1. 문제 풀이 전략
 *  bfs로 해결
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
public class Q2606 {
    static List<Integer>[] grape;
    static boolean visited[];

    static int bfs() {
        int cnt = 0;
        Queue<Integer> queue = new LinkedList();
        queue.offer(1);
        visited[1] = true;
        while (!queue.isEmpty()) {
            Integer front = queue.poll();

            for (int i = 0; i < grape[front].size(); i++) {
                Integer next = grape[front].get(i);
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                    cnt++;
                }

            }

        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computerCount = sc.nextInt();
        int edge = sc.nextInt();
        grape = new ArrayList[computerCount + 1];
        visited = new boolean[computerCount+1];

        for (int i = 1; i <= computerCount; i++) grape[i] = new ArrayList<>();

        for (int i = 0; i < edge; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            grape[x].add(y);
            grape[y].add(x);
        }


        System.out.println(bfs());
    }
}
