package learning.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

public class CopyOnWriteArrayListExp {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();
        cowal.add("A");
        cowal.add("B");
        cowal.add("E");
        cowal.add("A");
        cowal.add("D");
        System.out.println("cowal==" + cowal.toString());
        MyThread t1 = new MyThread(cowal);
        MyThread t2 = new MyThread(cowal);
        t1.start();
        t2.start();
        try {
            t1.join();t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Iterator<String> itr = cowal.iterator();
//        while (itr.hasNext()) {
//            System.out.print(itr.next() + ", ");
//            cowal.remove("D");
//        }
        Collections.sort(cowal);
        System.out.println("cowal==" + cowal.toString());
        System.out.println("cowal==" + cowal.size());

    }


    //Even better
    public static void filter(List<String> names, Predicate<String> condition) {
        names.stream().filter(condition::test).forEach(System.out::println);
    }
}

class MyThread extends Thread {
    List<String> list;

    public MyThread(List<String> list) {
        super();
        this.list = list;
    }

    public void run() {
        for (int i = 0; i < 300; i++) {
            list.add("A" + i);
            System.out.println(Thread.currentThread().getName()+"==cowal==" + list.toString());
            try {
                //Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}