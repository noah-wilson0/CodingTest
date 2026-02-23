import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //2-12복습
        //10773
        //27~34=7
        //stack사용

       /* Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque();
        int sum = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n == 0 && !stack.isEmpty()) {
                stack.pop();
            }
            else {
                stack.push(n);
            }
        }
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);*/
        //1193
        //37
        //알아야 하는것
        // 몇번째 대각선인가?
        // => 대각의 수는 +1씩 늘어남, (x>i, i++)일때 x-i가 가능할때까지 뺀다.
        // 더이상  뺼 수 없다면 i가 분모/분자 값이 된다.
        // 왼,오 어디 시작하는 대각인가?
        //i%2==0 을 하여 홀수 있때는 분자=i, 짝수일때 분모=i
        // 분모/분자의 값이 뭔가?
        //최종 x-i를 한 값이다. 기준 x=5일때  i=3
        // 분모=분모/분자 -(x-i) x-i=2이므로   분자 =3  3번째 대각의 2번째에 위치한다는 것으로
        //i=3이므로 왼쪽 시작(분자) 이므로 분자3- (대각 갯수3-대각선 위치위치값2)/ 분모 기본1 + (대각 갯수3-위치값2)
        //공식화:
        // 위치값=대각갯수n-대각선의 위치값(더이상 나눠지지않을때 i)
        // 홀: 기준i값(더이상 나눠지지 않을때 다음 i 값) -위치값/분모 기본1 + 위치값
        // 짝:분자 기본1 + 위치값 / 기준i값(더이상 나눠지지 않을때 다음 i 값) -위치값
        //시간 제한 걸릴 것 같긴 함 1~10_000_000 > 0.5초
        //15분 고민후 정답 참고
        //=> 등차수열 이용한다
        //  ==> 등차수열 n-1 합공식 을 빼는것과 같다. (n-1)(n-1+1)/2 = n(n-1)/2
        //loc=x-n(n-1)/2
        //홀수: loc/i-loc
        //짝수 i-loc/loc

        /*Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 0;
        int sum = 0;
        int loc = 0;

        while (x > sum) {
            i++;
            sum = (i - 1) * i / 2;
        }
        int prevCnt = sum - i + 1;
        loc = x - prevCnt;
        if (i % 2 != 0) {
            System.out.println(String.format("%d/%d",
                    loc,i-loc
                    ));
        } else {
            System.out.println(String.format("%d/%d",i-loc,loc));
        }*/

        //1018
        //40분?
        /*
         n-8만/m-8만큼 loop를 순회하여  다시 칠해야될 정사각형의 최소 갯수를 구한다.
         경우 1
         loop m이 홀수 값일 경우 B
         lop m 이 짝수 값일 경우 W
         경우 2
         loop m이 홀수 값일 경우 W
         lop m 이 짝수 값일 경우 B

         n-8, m-8 만큼 반복하며 최소 갯수를 갱신한다.
         경우 1의  다시 칠해야될 정사각형 갯수를 구한 후
         n*m- 경우1의 갯수 = 경우 2의 갯수
          최소 갯수 =min경(1우 1의 갯수,경우 2의 갯수)
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] board = new boolean[n][m]; //w=true, b=false

        int rn = n - 8+1;
        int rm = m - 8+1;

        int min = n * m;

        boolean check = true;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                char c = s.charAt(j);
                if (c == 'W') {
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
            }
        }

        for (int x = 0; x < rn; x++) {
            for (int y = 0; y < rm; y++) {
                int cnt = 0;
                for (int i = x; i < x + 8; i++) {  //i가 홀수일떄 w시작 i가 짝수일때 B시작 로직이 빠짐
                    for (int j = y; j < y + 8; j++) {
                        if (check) {
                            if ((j + 1) % 2 != 0 && board[i][j] != true) {
                                cnt++;
                            } else if ((j + 1) % 2 == 0 && board[i][j] != false) {
                                cnt++;
                            }
                        } else {
                            if ((j + 1) % 2 != 0 && board[i][j] != false) {
                                cnt++;
                            } else if ((j + 1) % 2 == 0 && board[i][j] != true) {
                                cnt++;
                            }
                        }
                    }
                    check = !check;
                }
                int cnt2 = Math.min(cnt, 64 - cnt);
                min = Math.min(min, cnt2);

            }
        }

        System.out.println(min);

    }


}
