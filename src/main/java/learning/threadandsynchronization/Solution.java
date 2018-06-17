package learning.threadandsynchronization;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Long[] intial_array=new Long[n];
        
        IntStream.range(0, m).forEach(z -> {
        	int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            IntStream.rangeClosed(a, b).forEach(i -> {
            	if(intial_array[i-1]==null) {
            		intial_array[i-1]=Long.valueOf(k);
            	}else {
            		intial_array[i-1]=intial_array[i-1].longValue()+k;
            	}
            });
        });
        
        in.close();
        System.out.println(Arrays.stream(intial_array).max((a,b)-> Long.compare(a,b)).get());
    }  
}