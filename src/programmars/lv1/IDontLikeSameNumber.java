package programmars.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 제목: 같은 숫자는 싫어(자료구조 스택 공부 후 진행 함.)
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12906
 * 플랫폼: 프로그래머스
 * 제한시간: 30분
 * 소요시간: 28분
 *
 * 1. 문제 접근 아이디어
 * 숫자 0~9로 이루어진 원소를 가진 배열 arr의 중복 숫자를 제거한다.
 * 단 제거된 후 원소들의 순서는 유지되어야 한다.
 * 2. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 3. 프로그래머스
 * solution(String s)메서드  사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 * 4. 이슈
 * arr 배열 인자로 넘기는 방법 미숙지
 * -> new int[]{1, 1, 3, 3, 0, 1, 1} 또는 int[] arr = {1, 1, 3, 3, 0, 1, 1}; 사용하기
 *
 * stack get 사용법 미숙지
 * stack pop for loop 이슈
 * for (int i = 0; i < stack.size(); i++) {
 *     answer[stack.size()-i-1] = stack.pop();
 * }
 * 에서 stack이 pop이 될때마다 stack.size()가 줄어드므로 정산적인 answer배열이 만들어 질 수 없음
 * 또한 i=2 loop의 stack.size()=2인 상황에서 loop가 종료되므로 정상적인 answer가 나오지 않음
 */

public class IDontLikeSameNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

//        //스택 사용
//        System.out.println(Arrays.toString(solution1(arr)));
//        System.out.println(Arrays.toString(solution2(arr)));

        //리스트 사용
        System.out.println(Arrays.toString(solution3(arr)));
    }

    public static int[] solution1(int []arr) {
        int[] answer;

        Stack<Integer> stack = new Stack<>();
        int now=10;

        for (int i = 0; i < arr.length; i++) {
            if (now != arr[i]) {
                stack.push(arr[i]);
                now = arr[i];
            }
        }
        int size = stack.size();
        answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }

    public static int[] solution2(int []arr) {
        int[] answer;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if ( stack.size()==0 || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        int size = stack.size();
        answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
    public static int[] solution3(int []arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.size() == 0 || list.get(list.size()-1)!=arr[i]) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    //아래는 이전에 List를 이용해 풀었던 방식이다.
    /*
        public int[] solution(int []arr) {
        int[] answer;
        ArrayList<Integer> list= new ArrayList<Integer>();
         int base=10;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=base){
                list.add(arr[i]);
                base=arr[i];
            }
        }
        answer=new int[list.size()];
        int index=0;
        for(int element:list){
            answer[index++]=element;
        }
        return answer;
    }
     */



}
