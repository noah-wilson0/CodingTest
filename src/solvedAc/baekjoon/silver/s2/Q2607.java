package solvedAc.baekjoon.silver.s2;

import java.util.Scanner;

/**
 * 제목: 비슷한 단어
 * 문제 링크: https://www.acmicpc.net/problem/2607
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 50~18
 *
 * 1. 문제 풀이 전략
 * 서로 다른 두 글자에서 한 문자를
 * 더하거나, 빼거나, 바꿧을때 동일한 글자가 되면 비슷한 글자이다.
 * 또한 두 글자의 문자 종류가 같으면 비슷한 글자이다.
 *
 *
 *
 * Map<Chracter, Integer>를 선언한다.
 * map에 글자의 문자들을 추가한다. map.put(array[i].charAt[j], map.getOrDefault(array[i].charAt[j],0)+1)
 * map.put(s.charAt[j], map.get(s.charAt[j])-1)을 s.length만큼 하고 난후
 * map.size()==0이면 문자 종류가 동일하므로 비슷한 글자이다.
 * map.size()==1이면 문자를 더해주거나 빼줄 수 있는 관계이므로 비슷한 글자이다.
 * map.size()==1 && map.get(0)==1 이면 문자를 바꿋을때 문자 종류가 동일하므로 비슷한 글자이다.
 *
 *2
 *  예외 케이스
 *
 *  반례
 * DOG 와 LOG는 비슷한 단어이다.
 * 3. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 4. 프로그래머스
 * solution(String s)메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 5. 이슈
 * else map.containKey(key)에서  map.clear를 안해줘서 그런듯
 * 다른 사람 코드 보니깐 map으로 하면 너무 스파게티라서 배열로 풀어보자
 *
 */
public class Q2607 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        String[] array = new String[t - 1];
        int cnt = 0;
        for (int i = 0; i < t - 1; i++) {
            array[i] = sc.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            boolean isSameString = true;
            for (int j = 0; j < word.length(); j++) {
                char key = word.charAt(j);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            for (int j = 0; j < s.length(); j++) {
                char key = s.charAt(j);
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) - 1);
                    if (map.get(key) == 0) {
                        map.remove(key);
                    }
                } else {
                    map.clear();
                    isSameString = false;
                    break;
                }
            }
            if (isSameString) {
                if (map.size() == 0) {
                    cnt++;
                } else if (map.size() == 1) {
                    for (Character character : map.keySet()) {
                        if (map.get(character) == 1) {
                            cnt++;
                        }
                    }
                } else {
                    map.clear();
                }
            }
        }
        System.out.println(cnt);*/

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] alphabet = new int[26];
        int result = 0;
        sc.nextLine();
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alphabet[c - 'A']++;
        }

        for (int i = 0; i < t - 1; i++) {

            int[] check = alphabet.clone();
            String s2 = sc.nextLine();
            int cnt = 0;

            if (Math.abs(s.length() - s2.length()) > 1) continue;
            for (int j = 0; j < s2.length(); j++) {
                char c = s2.charAt(j);
                if (check[c - 'A'] > 0) {
                    cnt++;
                    check[c - 'A']--;
                }
            }
            if (s.length() - 1 == s2.length()) {
                if (cnt==s2.length()) result++; //DOG - GO
            }
            else if (s.length() + 1 == s2.length()) {
                if (cnt==s.length()) result++;  //DOG - GOOD
            } else if (s.length() == s2.length()) {
                if (cnt==s.length()) result++; // DOG - GOD

                else if (cnt == s.length() - 1) result++; //DOG - DOT
            }



        }

        System.out.println(result);
    }
}
