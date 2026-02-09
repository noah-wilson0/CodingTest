package solvedAc.baekjoon.silver.s2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 제출 일시:
 * 제목: 유기농 배추
 * 문제 링크: https://www.acmicpc.net/problem/1012
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간: 10
 *
 * 관련 dfs, bfs문제
 * 1012 유기농 배추
 * 2667 단지번호붙이
 * 4963 섬의 개수
 * 2178 미로 탐색
 * 2583 영역 구하기
 * 
 * 1. 문제 접근 아이디어
 * boolean 50x50 배열을 false로 선언
 * for loop를 통해 입력받은 위치를 true로 변경
 * 기준 배추위치의 상하좌우 값은 상:(-1,0) 하:(+1,0) 좌:(0,-1) 우:(0,+1) 의 값이다.
 *  필요한 지렁이 최소 갯수가 필요하다 기준 배추 위치를 어떻게 찾을까?
 * 찾아보니 dfs, bfs문제인데 몰라서 공부해보고 함
 *
 * 배추의 상하좌우에 집중 안해도 되는 이유
 * =>  "한 배추의 상하좌우 네 방향에 다른 배추가 위치한 경우에 서로 인접해있는 것이다."라고하지만
 *     "배추들이 모여있는 곳에는 배추흰지렁이가 한 마리만 있으면 되므로 서로 인접해있는 배추들이 몇 군데에 퍼져있는지 조사하면.."
 *     라고 되어 있기떄문에 문제에서 힌트가 나와있다.
 *     한 배추의 네 방향에 인접한 배추일떄 인접한 배추이지만
 *     배추 흰 지렁이는 배추가 모여있는 곳에 한마리만 있으면 가능하므로 인접한 배추의 인접한 배추로
 *     모여있는곳은 한마리의 배추 흰지렁이가 이동하여 해결할 수 있다.
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
// dfs 공부완
/*public class Q1012 {
    static int mx;
    static int ny;
    static int[][] cabbage;
    static boolean[][] visited;

    static int ax[] = {-1, 1, 0, 0};
    static int ay[] = {0, 0, -1, 1};

    static void dfs(int x, int y) {
        visited[y][x] = true;

        for (int i = 0; i < ax.length; i++) {
            int adjacentX = x + ax[i];
            int adjacentY = y + ay[i];
            if (adjacentX >= 0 && adjacentY >= 0 && adjacentX < mx && adjacentY < ny){
                if (!visited[adjacentY][adjacentX] && cabbage[adjacentY][adjacentX] == 1) {
                    dfs(adjacentX, adjacentY);
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int cnt = 0;
            mx = sc.nextInt();
            ny = sc.nextInt();
            visited = new boolean[ny][mx];
            cabbage = new int[ny][mx];
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                cabbage[y][x] = 1;
            }
            for (int y = 0; y < ny; y++) {
                for (int x = 0; x < mx; x++) {
                    if (!visited[y][x] && cabbage[y][x] == 1) {
                        dfs(x,y);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }
}*/
//bfs 공부완
public class Q1012 {
    static int mx;
    static int ny;
    static int[][] cabbage;
    static boolean[][] visited;
    static Queue<int[]> queue = new LinkedList<>();

    static int ax[] = {-1, 1, 0, 0};
    static int ay[] = {0, 0, -1, 1};

    static void dfs(int x, int y) {
        visited[y][x] = true;
        queue.add(new int[]{x, y});
        while (!queue.isEmpty()) {

            int[] poll = queue.poll();
            for (int i = 0; i < ax.length; i++) {
                int adjacentX = poll[0] + ax[i];
                int adjacentY = poll[1] + ay[i];
                if (adjacentX >= 0 && adjacentY >= 0 && adjacentX < mx && adjacentY < ny) {
                    if (!visited[adjacentY][adjacentX] && cabbage[adjacentY][adjacentX] == 1) {
                        queue.offer(new int[]{adjacentX, adjacentY});
                        visited[adjacentY][adjacentX] = true;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int cnt = 0;
            mx = sc.nextInt();
            ny = sc.nextInt();
            visited = new boolean[ny][mx];
            cabbage = new int[ny][mx];
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                cabbage[y][x] = 1;
            }
            for (int y = 0; y < ny; y++) {
                for (int x = 0; x < mx; x++) {
                    if (!visited[y][x] && cabbage[y][x] == 1) {
                        dfs(x,y);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }
}

