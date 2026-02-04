package solvedAc.baekjoon.sprout.Geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 제목: 대지
 * 문제 링크: https://www.acmicpc.net/problem/9063
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 16
 *
 * 1. 문제 풀이 전략
 *  N개의 점을 가지고 만들어지는 직사각형의 넓이 구하기
 *  N= 2,3,4일때는 직사각형이 만들어지고
 *  N=1일때는 만들어지지 않으므로 0 출력
 *
 *  (MaxX-MinX) * (MaxY - MinY) = N개의 점이 포함되는 직사각형의 넓이
 *
 *  
 *2
 *  예외 케이스
 *
 *  반례
 * 
 * 3. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 4. 프로그래머스
 * solution(String s)메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 5. 이슈
 * 
 * 
 */

public class Q9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[] xAxis = new int[t];
        int[] yAxis = new int[t];
        if (t==1) {
            br.close();
            System.out.println(0);
            return;
        }
        for (int i = 0; i < t; i++) {
            String[] split = br.readLine().split(" ");
            xAxis[i] = Integer.parseInt(split[0]);
            yAxis[i] = Integer.parseInt(split[1]);
        }
        int w = Arrays.stream(xAxis).max().orElse(0) - Arrays.stream(xAxis).min().orElse(0);
        int h = Arrays.stream(yAxis).max().orElse(0) - Arrays.stream(yAxis).min().orElse(0);

        System.out.println(w*h);
        br.close();
    }
}
