package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<String>();
        obj.add("gagan");
        obj.add("jot");
        obj.add("kaur");
        obj.add("jotnav");
        obj.add("AMAN");
        System.out.println("list is"+obj);
        obj.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("list is after sorting using java8 "+obj);
        obj.add(0,"singh");
        System.out.println("list is"+obj);
        obj.set(0,"khalsa");
        System.out.println("list is"+obj);
        obj.remove("jot");

        System.out.println("list is"+obj+"size of array list"+obj.size());
        ArrayList<Integer> loop=new ArrayList<Integer>();
        loop.add(0,20);
        loop.add(1,30);
        loop.add(2,3);

        System.out.println(loop);
        loop.sort(Comparator.naturalOrder());
         loop.add(1,loop.remove(loop.size()-1));
        for (Integer num:loop
             ) {
            System.out.println("ArrayShift example"+num);
        }
        Collections.sort(loop);
        System.out.println("Iterator example");
        Iterator iterator=loop.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        /*ArrayList obj1=new ArrayList();
        obj1.add("jot");
        obj1.add("gagan");
        String s=obj.get(0);*/
    }
}
