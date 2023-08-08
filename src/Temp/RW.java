package Temp;

import java.util.Scanner;

public class RW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int procs = sc.nextInt();

        int cycles = 0;
        int readsInCurrentCycle = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'R') {
                readsInCurrentCycle++;
                if (readsInCurrentCycle == procs) {
                    cycles++;
                    readsInCurrentCycle = 0;
                }
            } else if (ch == 'W') {
                if (readsInCurrentCycle > 0) {
                    cycles++;
                    readsInCurrentCycle = 0;
                }
                cycles++;
            }
        }

        if (readsInCurrentCycle > 0) {
            cycles++;
        }


        System.out.println(cycles);
    }
}
