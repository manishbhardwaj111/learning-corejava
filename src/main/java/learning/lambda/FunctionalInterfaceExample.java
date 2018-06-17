package learning.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {
   public static void main(String[] args) {
       BinaryOperator<Integer> adder = (n1, n2) -> n1 + n2;
       System.out.println(adder.apply(3, 4));

       Function<Integer,String> converter = (i)-> Integer.toString(i);
       System.out.println(converter.apply(3).length());
       System.out.println(converter.apply(30).length());

       Predicate<String> i  = (s)-> s.length() > 5;
       System.out.println(i.test("java2s.com"));

       Supplier<String> s  = ()-> "java2s.com";
       System.out.println(s.get());

       BiConsumer<String, String> biConsumer = (x, y) -> System.out.println(x+"="+y);
       biConsumer.accept("java2s.com", "tutorials");

       BiFunction<String,String,String> bi = (x, y) ->  x + y;
       System.out.println(bi.apply("java2s.com", " tutorial"));

       BiPredicate<Integer, Integer> b2 = (x, y) -> x > y;
       System.out.println(b2.test(2, 3));
   }
}
