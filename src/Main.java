import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Main {
    static int n;
    static boolean[] visited;
    static List<Integer>[] grape;

    static void dfs(int s) {// 방문
        Deque<Integer> stack = new ArrayDeque();
        StringBuilder sb = new StringBuilder();
        stack.push(s);

        while (!stack.isEmpty()) { // 방문해야될 오름차순 인접 정점을 stack에 추가한다. 방문하지 않은 정점일시 sb추가 된다.
            Integer top = stack.pop();
            if (!visited[top]) {
                visited[top] = true;
                sb.append(top + " ");
                for (int i = grape[top].size() - 1; i >= 0; i--) {
                    if (!visited[grape[top].get(i)]) {
                        stack.push(grape[top].get(i));
                    }
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
    static void bfs(int s) { //bfs는 방문하지 않은 오름차순 인접 정점을 큐에 추가하고 visited[top]=true 추가해야됨을 알았다.  방문했을떄 sb추가 해야된다.
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        queue.offer(s);
        visited[s] = true;
        while (!queue.isEmpty()) {
            Integer front = queue.poll();
            sb.append(front + " ");
            for (int i = 0; i < grape[front].size(); i++) {
                if (!visited[grape[front].get(i)]) {
                    visited[grape[front].get(i)] = true;
                    queue.offer(grape[front].get(i));
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
    public static void main(String[] args) throws IOException {
        //1260 2회차 복습
        //50
        //중심 로직 을 짜는데 에러가 있어 책 및 정답 코드 1회 참고함
        //다시 풀어보기
        //dfs는 방문하지 않은 오름차순 인접 정점을 방문할때 sb 추가 및, visited[top]=true로 해야함을 알았지만 방문하지 않은 정점에 대해서만 탐색이 수행되어야 함을 빼먹음
        //또한 스택는 LIFO라서 오름차순 정렬된 grape 값을 반대로 스택에 넣어줘야함을 빼먹음
        //bfs는 방문하지 않은 오름차순 인접 정점을 큐에 추가하고 visited[top]=true 추가해야됨을 알았다.  방문했을떄 sb추가 해야된다.
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        grape = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i = 1; i <= n; i++) grape[i] = new ArrayList<>();


        for (int i = 1; i <= m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            grape[x].add(y);
            grape[y].add(x);
        }

        for (int i = 1; i <= n; i++) Collections.sort(grape[i]);

        dfs(s);
        Arrays.fill(visited, false);
        bfs(s);

        sc.close();*/
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        grape = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) grape[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            grape[x].add(y);
            grape[y].add(x);
        }

        for (int i = 1; i <= n; i++) Collections.sort(grape[i]);

        dfs2(s);
        Arrays.fill(visited, false);
        bfs2(s);
    }


    //dfs2
    //오름차순 방문햇을때 true를 한다. -> pop을 한 후에 true를 한다.
    // -> dfs의 핵심은 깊게 방문하는것 .stack은 LIFO이므로 pop할때 검증 및 true
    // -> 를 하며 점점 깊게 방문 가능해짐 pop할때마다 방문하지 않은오름차순 인접 노드
    // -> 를 탐색해 나가게 된다.
    //인접 노드가 방문하지 않은 오름차순 노드를 stack에 추가한다.
    static void dfs2(int s) {
        Deque<Integer> stack = new ArrayDeque();
        StringBuilder sb = new StringBuilder();
        stack.push(s);

        while (!stack.isEmpty()) {
            Integer top = stack.pop();
            if (!visited[top]) {
                visited[top] = true;
                sb.append(top + " ");
                for (int i = grape[top].size() - 1; i >= 0; i--) { //stack은 lifo, graph는 오름차순이므로 반대로 stack에 추가해야된다.
                    Integer next = grape[top].get(i);
                    if (!visited[next]) {
                        stack.push(next);
                    }
                }
            }
        }
        System.out.println(sb.toString().trim());
    }

    //bfs2
    //방문한 노드는 true한다. -> 큐에 추가할때 true한다.
    //인접 노드가 방문하지 않은 오름차순 노드를 queue에 추가한다.
    // -> 큐는 FIFO이므로 offer할때 true를 하지 않으면 2번째 인접 노드들의 공통된
    // -> 3번째 인접 노드들이 중복 추가되기 때문이다.
    static void bfs2(int s) {
        Queue<Integer> queue = new LinkedList();
        StringBuilder sb = new StringBuilder();
        queue.offer(s);
        visited[s] = true;
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            sb.append(poll + " ");

            for (int i = 0; i < grape[poll].size(); i++) {
                Integer next = grape[poll].get(i);
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }

        }
        System.out.println(sb.toString().trim());
    }



}