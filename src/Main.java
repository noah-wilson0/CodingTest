import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {



    public static void main(String[] args) throws IOException {
        //8979
        //06~13
        //정렬해도 되지만 k국가보다 더 잘한 나라수를 구하는게 더 좋다.
        //이건왜 28점 이지?
        //잘 모르겠음 배열로 하니깐 정상적으로 100점 나옴
//       Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int k = sc.nextInt();
       /*List<Integer>[] list = new ArrayList[n+1];
        int cnt = 0;
        for (int i = 1; i <= n; i++) list[i] = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int country = sc.nextInt();
            int g = sc.nextInt();
            int s = sc.nextInt();
            int b = sc.nextInt();

            list[country].add(g);
            list[country].add(s);
            list[country].add(b);
        }

        for (int i = 1; i <= n; i++) {

            if (i == k) continue;

            if (list[i].get(0) > list[k].get(0)) {
                cnt++;
            } else if (list[i].get(0) == list[k].get(0) &&
                    list[i].get(1) > list[k].get(1)) {
                cnt++;
            } else if (list[i].get(0) == list[k].get(0) &&
                    list[i].get(1) == list[k].get(1) &&
                    list[i].get(2) > list[k].get(2)) {
                cnt++;
            }
        }
        System.out.println(cnt+1);*/
        /*int[][] array = new int[n+1][3];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int country = sc.nextInt();
            int g = sc.nextInt();
            int s = sc.nextInt();
            int c = sc.nextInt();
            array[country] = new int[]{g, s, c};
        }

        for (int i = 1; i <= n; i++) {
            if (i==k) continue;

            if (array[i][0] > array[k][0]) {
                cnt++;
            } else if (array[i][0] == array[k][0] && array[i][1] > array[k][1]) {
                cnt++;
            } else if (array[i][0] == array[k][0] && array[i][1] == array[k][1] && array[i][2] > array[k][2]) {
                cnt++;
            }
        }

        System.out.println(cnt+1);*/
        //1748
        //27분 소요
        //시간 제한 0.15초를 보니 loop로 하는건 아닌듯
        //String 으로도 가능, %10을 해서 int형으로 해보자
/*        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int length = 1;
        int start = 1;
        while (start <= n) {
            int end = Math.min(start * 10 - 1, n);
            int count = end - start + 1;
            result += count *length; //갯수 *자릿수
            start *= 10;
            length ++;
        }
        System.out.println(result);*/

        //2161
        //33~37
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList();
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for (int i = 1; i <= n; i++) queue.offer(i);


        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if (cnt % 2 != 0) {
                sb.append(poll + " ");
            } else {
                queue.offer(poll);
            }
            cnt++;
        }
        System.out.println(sb.toString().trim());
    }
}