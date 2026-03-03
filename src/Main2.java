import java.util.*;

public class Main2 {
    public static void main(String[] args)  {
        //2-24
        //30804
        //34
        //두 포인터 문제인듯
        //과일의 종류가 2개 이상 확인방법?Set.size>2

/*        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];
        int left = 0;
        int right = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            array[i] = num;
        }


        for (right = 0; right < n; right++) {
            map.put(array[right], map.getOrDefault(array[right], 0) + 1);

            while (map.size() > 2) {
                map.put(array[left], map.get(array[left]) - 1);
                if (map.get(array[left])==0) {
                    map.remove(array[left]);
                }
                left++;
            }

            max = Math.max(max, right - left + 1);


        }
        System.out.println(max);*/

        //2607
        //40
        /*
        두 단어의 문자 종류가 같을때,
        같은 문자의 갯수(문자 하나를 더하거나, 빼거나, 바꾸어도 된다)일때
        비슷한 단어가 된다.
        알파벳 int배열 사용

        map으로 문자 갯수가 똑같은지 확인하기
        문자 종류 = s1 알파벳 배열[s2.charAt(i)] > 0일때 ++
        1. s1.length-1=s2.length
        1-1. s2.문자 종류=s2.length =>  s1의 문자를 뺏을때 두단어가 같은 종류의 문자
        2. s1.length+1=s2.length
        2-1. s1.문자 종류 = s1.length => s1의 문자를 더했을때 두단어가 같은 종류의 문자
        3. s1.length=s2.length
        3-1. s1.length=s2.문자 종류 => s1과 s2의 문자 갯수가 같을떄  문자 종류가 같은 문자
        3-2. s2.문자 종류 = s1.length -1 => s1과 s2의 문자 갯수가 같을떄 문자종류 1개를 바꾸면 같은 문자
         */
        /*Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[] alphabet = new int[26];
        int result = 0;
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alphabet[c - 'A']++;
        }

        for (int i = 0; i < t - 1; i++) {
            int[] check = alphabet.clone();
            String s2 = sc.next();
            int cnt = 0;

            for (int j = 0; j < s2.length(); j++) {
                if (check[s2.charAt(j) - 'A'] > 0) {
                    check[s2.charAt(j) - 'A']--;
                    cnt++;
                }
            }
            if (s.length() - 1 == s2.length()) {
                if (cnt == s2.length()) result++;
            } else if (s.length() + 1 == s2.length()) {
                if (cnt == s.length()) result++;
            } else if (s.length() == s2.length()) {
                if (cnt == s.length() || cnt == s2.length() - 1) result++;
            }

        }
        System.out.println(result);*/
        //1966
        //4~9 36~45 = 14
        //PQ<INDEX,PRIORITY>와 QUEUE<INDEX,PRIORITY>사용하면 쉬울듯
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            Queue<Node> queue = new LinkedList<>();
            PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(Node::getPriority).reversed());
            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int j = 0; j < n; j++) {
                int priority = sc.nextInt();
                queue.offer(new Node(j, priority));
                pq.offer(new Node(j, priority));
            }
            int cnt = 1;
            while (!queue.isEmpty()) {
                Node poll = queue.poll();
                if (poll.priority < pq.peek().priority) {
                    queue.offer(poll);
                    continue;
                }
                if (poll.index == m) {
                    System.out.println(cnt);
                    break;
                }
                pq.poll();
                cnt++;

            }
        }


    }
    static class Node{
        int index;
        int priority;

        public Node(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }

        public int getIndex() {
            return index;
        }

        public int getPriority() {
            return priority;
        }
    }



}
