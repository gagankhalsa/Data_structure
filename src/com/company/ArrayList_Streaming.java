package com.company;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayList_Streaming {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i=0;i<=50;i++)
        {
            arrayList.add(i);
        }
        System.out.println(arrayList.stream().filter(value -> value%2==0)
                .mapToInt(Integer::intValue).sum());

    }

}
