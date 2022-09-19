package algorithm.array;

import java.util.Scanner;

public class Sample5 {

    public void solution(int n) {
       int a = 1;
       int b = 1;
       int c;

        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++) {
            c = a+b;
            System.out.print(c+ " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Sample5 sample5 = new Sample5();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        sample5.solution(n);
    }
}
