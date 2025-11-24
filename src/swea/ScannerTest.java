package swea;

import java.util.Scanner;

public class ScannerTest {

/*
testNextIntNextInt
3
4

3 4
5

testNextIntNextLine
3
4 5

3 4
5

testNextIntRemoveThenNextLine
Hello world
SWEA test line
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 입력 예시 ===");
        System.out.println("3");
        System.out.println("Hello world");
        System.out.println("SWEA test line");

        System.out.println("\n--- 실제 테스트 시작 ---");

//        System.out.println("\n1) nextInt() → nextInt()");
//        testNextIntNextInt();

        System.out.println("\n2) nextInt() → nextLine()");
        testNextIntNextLine();
//
//        System.out.println("\n3) nextInt() → nextLine(버퍼삭제) → nextLine()");
//        testNextIntRemoveThenNextLine();
    }

    private static void testNextIntNextInt() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   // 3
        int b = sc.nextInt();   // 4
        int c = sc.nextInt();   // 5

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    private static void testNextIntNextLine() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();     // 3 읽음
        String line1 = sc.nextLine(); // ← 여기서 바로 빈 문자열("") 반환
        String line2 = sc.nextLine(); //

        System.out.println("a = " + a);
        System.out.println("line1 = \"" + line1 + "\"");
        System.out.println("line2 = \"" + line2 + "\"");
    }

    private static void testNextIntRemoveThenNextLine() {
        Scanner sc = new Scanner(System.in);


        String real1 = sc.nextLine(); // Hello world
        String real2 = sc.nextLine(); // SWEA test line

        System.out.println("real1 = \"" + real1 + "\"");
        System.out.println("real2 = \"" + real2 + "\"");
    }
}

