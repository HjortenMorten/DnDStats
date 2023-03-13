import java.util.*;
public class Stats {
    public static void main(String[] args){
        roll();
    }
    public static void roll() {
        Random d6 = new Random();
        int total = 0;
        while (total <= 70) {
            total = 0;
            for (int j = 0; j < 6; j++) {
                int[] kast4 = {0, 0, 0, 0};
                for (int i = 0; i < 4; i++) {
                    kast4[i] = d6.nextInt(6) + 1;
                }
                Arrays.sort(kast4);
                System.out.println(kast4[1] + kast4[2] + kast4[3]);
                total = kast4[1] + kast4[2] + kast4[3] + total;
            }
            System.out.println("Your total stats are:" + total);
        }
    }
}
