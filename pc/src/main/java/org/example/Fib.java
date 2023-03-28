package org.example;

import java.util.ArrayList;
import java.util.List;

public class Fib {
    int a=0,b=1,c=0;

    public List<Integer> fibseries(int num)
    {
        List<Integer> my=new ArrayList<Integer>();
        int i=0,j=1,next;
        for(int c=0;c<num;c++) {
            if (c <= 1)
                next = c;
            else {
                next = i + j;
                i = j;
                j = next;
            }
            my.add(next);
        }
        return my;
    }
}
