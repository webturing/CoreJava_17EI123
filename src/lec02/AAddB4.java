package lec02;

import java.util.Scanner;


public class AAddB4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            if (a == 0 && b == 0) break;
            System.out.println(a + b);
        }
    }

}
