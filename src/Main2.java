import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //2828
        //41~02 =21분  바구니 이동 로직 생각하는데 10분 넘게 걸림
        // 바구니가 왼/오 로 이동해야할 경우를 알려면
        // 바구니의 left/right값을 따로 저장해야 된다.
        //left는 항상 1에서 시작, right=m이다.
        //공식: 이동할 위치 - 이동거리, 위치 조정
        //left > j 일때, 이동거리=left - j  left=j, right= right - 이동거리(left - j)
        //right < j 일때, 이동거리=j - right right=j, left= left + 이동거리(j-right)
        //left <= j  && right>=j 일때 이동거리 없음


/*        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int j = sc.nextInt();

        int left=1;
        int right = m;

        int distance = 0;
        int total = 0;

        for (int i = 0; i < j; i++) {
            int apple = sc.nextInt();

            if (left > apple) {
                distance = left - apple;
                left = apple;
                right -= distance;
                total += distance;
            } else if (right < apple) {
                distance = apple - right;
                left += distance;
                right = apple;
                total += distance;
            }
        }
        System.out.println(total);*/

        //2941
        //24~33=9
        //queue에 char단위로 추가하고 조건문으로  글자수 카운트 ++
        //queue로 하므로 조건문에서 npe가능 끝 문자가 c,d,l,n,s,z등일 경우 NPE발생
        //-> fori, s.charat, index변경을 통해 글자 마다 loop돌 수 있게 , 글자수 카운트는 loop마다
        /*Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'c') {
                if (i + 1 < s.length()) {
                    char c1 = s.charAt(i + 1);
                    if (c1 == '=' || c1 == '-') i++;
                }

            } else if (c == 'd') {
                if (i + 1 < s.length()) {
                    char c1 = s.charAt(i + 1);
                    if (c1 == '-') {
                        i++;
                    } else if (c1 == 'z') {
                        if (i + 2 < s.length() && s.charAt(i + 2) == '=') {
                            i += 2;
                        }
                    }
                }

            } else if (c == 'l') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'j') i++;

            } else if (c == 'n') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'j') i++;

            } else if (c == 's') {
                if (i + 1 < s.length() && s.charAt(i + 1) == '=') i++;

            } else if (c == 'z') {
                if (i + 1 < s.length() && s.charAt(i + 1) == '=') i++;
            }

            cnt++;
        }
        System.out.println(cnt);*/
        //4673
        //2~19=17
        //셀프 넘버=생성자가 없는 숫자.
        //n= 생성자(정수n + n의 자릿수...)
        //ex) 2= 1+1 4=2+2 ... 39=33+3+3
        // 2는 생성자 1이 있다. 4는 생성자 2가 있다. ....
        //생성자가 없는 숫자를 구하는 방법?
        //1~10_000숫자를 loop를 돌며 n+ (n의 자릿수)합을 구하여 나온 값을
        // boolean[10_000]에 true를 한다.
        //final loop에서 true가 아닌 i를 출력한다.

        //자릿수는 n%10을통해 얻는다.
        //n%10을 n의 자릿수만큼 진행하면 n~1번째 자릿수 구해진다.
        //
        boolean[] booleans = new boolean[10_000 + 1];
        for (int i = 1; i <= 10_000; i++) {

            String s = String.valueOf(i);
            int num = i;
            int constNum = i;
            for (int j = 0; j < s.length(); j++) { //자릿수만큼 더하기
                constNum += num % 10;
                num /= 10;
            }
            if (constNum <= 10_000) {
                booleans[constNum] = true;
            }
        }

        for (int i = 1; i <= 10_000; i++) if (!booleans[i]) System.out.println(i);

    }


}
