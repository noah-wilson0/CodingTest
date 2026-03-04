import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) throws IOException {
        //2-25
        //1343
        //40
        /*
            '.'은 그대로 출력한다.
            'XXXX' -> 'AAAA'
            'XX' -> 'BB'로 출력한다

            split '.'을 사용하면 "XXXX"같은거 처리못하므로 charAt사용하기
            1. split[i]=='.'라면 '.'출력
            2. split[i]가 2로 나눠지지 않으면  -1 출력
            3. split[i]가 2로 나눠지고 4로 나눳을때 나누어 떨어진다면 A로 모두 채운다.
            4. split[i]가 2로 나눠지고 4로 나눳을때 나누어 떨어지지 않는다면
             split[i]/4만큼 'AAAA'로채우고  split[i]%4만큼 B로 채운다.

             위 과정을 반복한다.
         */

/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='X') {
                cnt++;
            } else  {
                if (cnt%2==1) {
                    System.out.println(-1);
                    return;
                }
                while (cnt>0) {
                    if (cnt - 4 >= 0) {
                        sb.append("AAAA");
                        cnt -= 4;
                    } else if (cnt == 2) {
                        sb.append("BB");
                        cnt -= 2;
                    }

                }
                sb.append(".");
            }

        }
        if (cnt > 0) {
            if (cnt%2==1) {
                System.out.println(-1);
                return;
            }
            while (cnt > 0) {
                if (cnt - 4 >= 0) {
                    sb.append("AAAA");
                    cnt -= 4;
                } else if (cnt == 2) {
                    sb.append("BB");
                    cnt -= 2;
                }

            }
        }

        System.out.println(sb);
        br.close();*/

        /*
        2477
        43 ~ 53 틀림
        참외밭은 항상 육강형이다.
        참외밭의 모형은 항상 'ㄱ'모양을 90,180,270 도를 뒤집은 형태이다.
        즉 , 큰 직사각형 넓이에서 작은 직 사각형 넓이를 빼면 된다.

        큰 직사각형 넓이 : Direction(1,2) 의 max value= w *  Direction(3,4) 의 max value= h
        작은 직사각형 넓이 : Direction(1,2) 의 min value= w *  Direction(3,4) 의 min value= h

         1. 큰 직사각형과 작은 직 사각형의 maxW/H, minW/H값을 구한 후
         2. (큰 직사각형 넓이 - 작은 직 사각형 넓이) * k

         => 틀린 이유 minW/H가 항상 작은 사각형의 변이라고 장담할 수 없음
         항상 'ㄱ'모양을 유지하므로 minW/H의 길이는 가장 긴변 양옆 변을 빼면 값이 나온다.


         */
/*        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int[] dir = new int[6];
        int[] len = new int[6];
        int maxW = 0;
        int maxH = 0;
        int minW = 500;
        int minH = 500;
        int idxW = -1;
        int idxH = -1;
        for (int i = 0; i < 6; i++) {
            int direction = sc.nextInt();
            int m = sc.nextInt();
            dir[i] = direction;
            len[i] = m;
            if (dir[i] == 1 || dir[i] == 2) {
                if (len[i] > maxW) {
                    maxW = len[i];
                    idxW = i;
                }
            } else {
                if (len[i] > maxH) {
                    maxH = len[i];
                    idxH = i;
                }
            }

        }
        minW = Math.abs(len[(idxH + 5) % 6] - len[(idxH + 1) % 6]);
        minH = Math.abs(len[(idxW + 5) % 6] - len[(idxW + 1) % 6]);
        int bigRectangle = maxW * maxH;
        int smallRectangle = minW * minH;

        System.out.println((bigRectangle-smallRectangle) * k);*/

        //2-24 2회차 복습
        //30804
        //10~29
        /*

        Map<int kind , int cnt> 를 사용하여 탕호루의 종류를 셀 수 있게 한다.
       map.size > 2일떄 while loop를 통해  map.put(index, map.get -1))를 수행한다.
         */
   /*     Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] array = new int[t];
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0; i < t; i++) {
            array[i] = sc.nextInt();
        }
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            int right= array[j];
            map.put(right, map.getOrDefault(right, 0) + 1);

            while (map.size() > 2) {
                int left= array[i];
                map.put(left, map.get(left) - 1);
                if (map.get(left) == 0) {
                    map.remove(left);
                }
                i++;
            }
            result = Math.max(result, j - i + 1);

        }


        System.out.println(result);*/

        //2607
        //33
        /*
        비슷한 단어 조건
        1. 문자의 길이가 같다.
        2. 단어의 종류가 같다.
        3. 한 단어의 문자 하나를 더하거나 빼거나 바꿧을때 같은 구성을 가지는 경우 비슷한 단어다.

        정리:
        match= s2가 s의 단어와 같은 종류의 수
        1. s.length -1 ==s2.length    => GOD - GO 관계
            1-1.math=s.length
        2. s.length +1 ==s2.length
            2-1.math=s2.length    => GOD - GOOD 관계
        2. s.length ==s2.length
            3-1. s.length  == match +1 => DOG -DIG 관계
             3-1. s.length  == match  => DOG -GOD 관계  => 빼먹음

        match를 어떻게 구하지?
        알파벳 배열에 갯수 저장해서
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = sc.next();
        int[] alphabet = new int[26];

        for (int j = 0; j < s.length(); j++) alphabet[s.charAt(j) - 'A']++;

        int result = 0;
        for (int i = 0; i < t - 1; i++) {
            int[] check = alphabet.clone();
            String s2 = sc.next();
            if (Math.abs(s.length() - s2.length()) > 1) continue;
            int match = 0;
            for (int j = 0; j < s2.length(); j++) {
                char c = s2.charAt(j);
                if (check[c - 'A'] > 0) {
                    match++;
                    check[c - 'A']--;
                }
            }

            if (s.length() - 1 == s2.length()) {
                if (match==s2.length()) result++;
            } else if (s.length() + 1 == s2.length()) {
                if (match==s.length()) result++;
            } else if (s.length() == s2.length()) {
                if (match==s.length()) result++;
                else if (match + 1 == s.length()) result++;
            }
        }

        System.out.println(result);
    }





}
