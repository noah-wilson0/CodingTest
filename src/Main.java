import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 복습용
 * 2026-01-20 -> 2026-01-22
 * 2675, 9086, 10809 => 완
 * 2026-01-21 -> 2026-01-30
 * 2908, 5622, 11718
 * 2026-01-22 -> 2026-01-24
 * 2738,2566,10798,2563
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //2908
        //3
        /*Scanner sc = new Scanner(System.in);
        StringBuilder n = new StringBuilder(sc.next()).reverse();
        StringBuilder m = new StringBuilder(sc.next()).reverse();
        int a = Integer.parseInt(n.toString());
        int b = Integer.parseInt(m.toString());
        System.out.println(a > b ?a:b);*/

        //5622
        //5
        /*
        숫자 1~0 2~11초
        for - switch로 해결
         */

        /*Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'A': case 'B': case 'C':
                    sum += 3;
                    break;
                case 'D': case 'E': case 'F':
                    sum += 4;
                    break;
                case 'G': case 'H': case 'I':
                    sum += 5;
                    break;
                case 'J': case 'K': case 'L':
                    sum += 6;
                    break;
                case 'M': case 'N': case 'O':
                    sum += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    sum += 8;
                    break;
                case 'T': case 'U': case 'V':
                    sum += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    sum += 10;
                    break;
            }
        }
        System.out.println(sum);*/

        //11718
        //4

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();


            System.out.println(s);
        }


    }
}