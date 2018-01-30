package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<String>();
        obj.add("gagan");
        obj.add("jot");
        obj.add("kaur");
        obj.add("nav");
        System.out.println("list is"+obj);
        obj.add(0,"singh");
        System.out.println("list is"+obj);
        obj.set(0,"khalsa");
        System.out.println("list is"+obj);
        obj.remove("jot");
        System.out.println("list is"+obj+"size of array list"+obj.size());
    }
}
