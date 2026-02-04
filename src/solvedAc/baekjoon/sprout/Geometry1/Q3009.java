package solvedAc.baekjoon.sprout.Geometry1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 제목: 네 번쨰 점
 * 문제 링크: https://www.acmicpc.net/problem/3009
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 14
 *
 * 1. 문제 풀이 전략
 * 좌표를 어떻게 구현해야 하지?
 * x,y값이 2개씩 같은 값이 존재하므로  x,y값 유추 가능
 * Map으로 하면 되려나
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
 * 좌표 값의 갯수에 집중하여 Map을 사용했지만
 * 비교하여 비동등값이라는 것에 집중 하였으면 각 좌표를 array에 저장하여
 * 동등 비교 조건문을 통해 해결 가능하다.
 *
 */

public class Q3009 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        int ox=0;
        int oy=0;
        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> xEntry : xMap.entrySet()) {
            if (xEntry.getValue() == 1) {
                ox=xEntry.getKey();
            }
        }
        for (Map.Entry<Integer, Integer> yEntry : yMap.entrySet()) {
            if (yEntry.getValue() == 1) {
                oy=yEntry.getKey();
            }
        }
        System.out.println(String.format("%d %d", ox, oy));
        sc.close();*/
        Scanner sc = new Scanner(System.in);
        int[] xAxis = new int[3];
        int[] yAxis = new int[3];

        int x=0;
        int y=0;
        for (int i = 0; i < 3; i++) {
            int ix = sc.nextInt();
            int iy = sc.nextInt();
            xAxis[i] = ix;
            yAxis[i] = iy;
        }
        if (xAxis[0] == xAxis[1]) {
            x = xAxis[2];
        } else if (xAxis[0] == xAxis[2]) {
            x = xAxis[1];
        } else {
            x=xAxis[0];
        }
        if (yAxis[0] == yAxis[1]) {
            y = yAxis[2];
        } else if (yAxis[0] == yAxis[2]) {
            y = yAxis[1];
        } else {
            y=yAxis[0];
        }

        System.out.println(String.format("%d %d", x, y));
        sc.close();
    }
}
