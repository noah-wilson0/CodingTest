import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        //Q2164
        //FIFO > queue
        //6분 소요

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList();
        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() != 1) {
            Integer num = queue.poll();
            if (cnt % 2 == 0) {
                queue.offer(num);
            }
            cnt++;
        }
        System.out.println(queue.poll());

        sc.close();
    }
}