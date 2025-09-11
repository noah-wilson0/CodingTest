package solvedAc.baekjoon.silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * 제목: 단어 정렬
 * 문제 링크: https://www.acmicpc.net/problem/1181
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간: 29분
 *
 * 1. 문제 접근 아이디어
 * 알파벳 소문자로 이루어진 N개의 단어를 길이가 짧은 순서대로 정렬한다.(단. 길이가 같으면 사전순으로 정렬)
 * 문자열의 길이는 50을 넘지 않는다.
 *
 * 2. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 3. 프로그래머스
 * solution(String s)메서드  사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 */


public class Q1181 {
    public static void main(String[] args) throws IOException {
        /*
        // "단, 중복된 단어는 하나만 남기고 제거해야 한다."의 조건을  준수하지 못함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            strings.add(br.readLine());
        }

        strings.sort((a, b) ->{
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length()-b.length();
        }); //sort()사용법 미숙지

        strings.forEach(
                s -> {
                    System.out.println(s);
                }
        );

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> strings = new HashSet<>();

        for (int i = 0; i < N; i++) {
            strings.add(br.readLine());
        }

        List<String> list = strings.stream()
                .sorted((a, b) -> {
                    if (a.length() == b.length()) {
                        return a.compareTo(b);
                    }
                    return a.length() - b.length();
                })
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
