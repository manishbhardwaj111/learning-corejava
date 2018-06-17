package learning.quiz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CoinChange {
    static long ways(int n, int[] coins) {
        System.out.println(Arrays.toString(coins));
        long[] table = new long[n + 1];
        int m = coins.length;

        Arrays.fill(table, 0);   //O(n)

        table[0] = 1;

        for (int i = 0; i < m; i++)
            for (int j = coins[i]; j <= n; j++){
                //System.out.print(Arrays.toString(table) +"= "+i+","+j+" - "+(j - coins[i]));
                table[j] += table[j - coins[i]];
                //System.out.println(" ="+Arrays.toString(table));
            }



        return table[n];

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      // System.out.println(ways(4,new int[]{2,3,4}));
        main5sjhdjshjdshd(args);

    }

    public static void main5sjhdjshjdshd(String[] args) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

}