package learning.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ParellelProcessingTest {

    public static void main(String[] var0) {
        ArrayList var1 = new ArrayList();
        int var2 = 0;

        while(var2 < 1165455) {
            var1.add("" + var2++);
        }

        long var3 = System.currentTimeMillis();
        var1.parallelStream().forEach((var0x) -> {
            System.out.print("");
        });
        System.out.println("\nTotal time == " + (System.currentTimeMillis() - var3));
        var3 = System.currentTimeMillis();
        Iterator var5 = var1.iterator();

        while(var5.hasNext()) {
            String var6 = (String)var5.next();
            System.out.print("");
        }

        System.out.println("\nTotal time == " + (System.currentTimeMillis() - var3));
    }
}