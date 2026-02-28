import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2 {
    /*    static class Node {
            int index;
            int priority;

            public Node(int index, int priority) {
                this.index = index;
                this.priority = priority;
            }
        }*/
    static Character[][] array;
    static int n;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        //2-19복습
        //1966
        // 시간 초과
        //Map<인덱스Integer,중요도Integer> 자료구조를 사용하여 문서의 중요도를 알 수 있게 한다.
        // queue를 써서 문서의 인쇄 순서를 유지한다.
        //우선순위가 제일 높을때만 poll한다. 이외는 re-offer
        //위 과정을 반복하며 request와 같을때 break후 출력한다.
        //map이 아니라 pq를 쓰면 편해진다.

       /* Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        Queue<Node> queue = new LinkedList();
        PriorityQueue<Node> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.priority, a.priority)
        );

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int request = sc.nextInt();
            int result = 0;

            for (int j = 0; j < n; j++) {
                int element = sc.nextInt();
                queue.offer(new Node(j,element));
                pq.offer(new Node(j, element));
            }
            while (!queue.isEmpty()) {
                Node poll = queue.poll();
                Node peek = pq.peek();
                if (poll.priority < peek.priority) {
                    queue.offer(poll);
                    continue;
                }
                pq.poll();
                result++;
                if (poll.index == request) {
                    System.out.println(result);
                    break;
                }

            }
            queue.clear();
            pq.clear();

        }
        sc.close();*/

        //3085
        //시간초과49분 -> 하지만 로직 생각이 오래걸렷음
        //사탕의 색을 교환햇을때 시행마다 가장 긴 연속 부분의 길이를 비교 및 저장하여 최대갯수를 구한다.
        //행은 열교환,열은 행교환
        //행교환 array[i][j]!= array[i][j+1] 일때 swap(array[i][j+1],array[i+1][j+1]) (단, i+1<n or j+1<n)
        //열교환 array[i][j]!= array[i+1][j] 일때 swap(array[i+1][j],array[i+1][j+1]) (단, i+1<n or j+1<n)



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        array = new Character[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                array[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i + 1 < n) {
                    swap(i, j, i + 1, j);
                    check();
                    swap(i, j, i + 1, j);
                }
                if ( j + 1 < n) {
                    swap(i, j, i, j + 1);
                    check();
                    swap(i, j, i, j + 1);
                }

            }
        }
        System.out.println(max);
    }

    static void check() {
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n - 1; j++) {
                if (array[i][j] == array[i][j + 1]) {
                    cnt++;
                } else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
            max = Math.max(max, cnt);
        }

        //열 탐색
        for (int j = 0; j < n; j++) {
            int cnt = 1;
            for (int i = 0; i < n - 1; i++) {
                if (array[i][j] == array[i +1][j]) {
                    cnt++;
                } else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
                max = Math.max(max, cnt);

            }
            max = Math.max(max, cnt);
        }
    }
    static void swap(int i, int j, int k, int l) {
        Character temp = array[i][j];
        array[i][j] = array[k][l];
        array[k][l] = temp;
    }


}
