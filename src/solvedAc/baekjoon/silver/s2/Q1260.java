package solvedAc.baekjoon.silver.s2;

import java.util.*;

/**
 * 제출 일시:
 * 제목: DFS와 BFS
 * 문제 링크: https://www.acmicpc.net/problem/1260
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간: 52
 *
 * 1. 문제 접근 아이디어
 *
 *
 * 2. 반례
 *
 *
 * 3. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 4. 프로그래머스
 * solution(String s)메서드  사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 5. 이슈
 *
 */

public class Q1260 {
    static int n;
    static int m;
    static List<Integer>[] graph;
    static boolean[] visited;

    static void dfs(int s) {
        Deque<Integer> stack = new ArrayDeque();
        StringBuilder sb = new StringBuilder();
        stack.push(s);
        while (!stack.isEmpty()) {
            Integer top = stack.pop();
            if (!visited[top]) {
                visited[top] = true;
                sb.append(top + " ");
                for (int i = graph[top].size() - 1; i >= 0; i--) {
                    Integer next = graph[top].get(i);
                    if (!visited[next]) {
                        stack.push(next);
                    }
                }
            }
        }

        System.out.println(sb.toString().trim());
    }

    static void bfs(int s) {
        Queue<Integer> queue = new ArrayDeque();
        StringBuilder sb = new StringBuilder();
        visited[s] = true;
        queue.offer(s);
        while (!queue.isEmpty()) {
            Integer front = queue.poll();
            sb.append(front + " ");

            for (int i=0; i<graph[front].size(); i++) {
                Integer next = graph[front].get(i);
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
    public static void main(String[] args) {
        //dfs
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int startNodeNumber = sc.nextInt();
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();

        for (int i = 1; i <= m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }
        for (int i = 1; i <= n; i++) Collections.sort(graph[i]);


        dfs(startNodeNumber);

        Arrays.fill(visited, false);
        bfs(startNodeNumber);

    }
}
