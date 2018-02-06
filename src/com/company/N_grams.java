package com.company;

import sun.net.www.content.text.Generic;

import java.util.*;

public class N_grams {
    static int[] uni = null;
    static ArrayList<String> def = null;
    static ArrayList<String> arrayList2 = null;
    static StringTokenizer s = null;
    static String st = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; i <= input; i++) {
            st += sc.nextLine() + " ";
        }
        st = st.replaceAll("[^A-Za-z]+", "");
        //s = new StringTokenizer(st, " ");
        int input1 = sc.nextInt();
        if (input1 < 0 && input1 > 4) {
            return;
        }
        switch (input1) {
            case 1:
                unigram();
                break;
            case 2:
                bigram();
                break;
            case 3:trigram();
                break;
        }
    }

    public static void bigram() {
        def = new ArrayList<>();
        System.out.println(st);
        System.out.println("length is " + st.length());
        int length;
        if (st.length() % 2 != 0) {
            length = st.length() - 1;
        } else {
            length = st.length();
        }
        for (int i = 0; i < length; i += 2) {
            def.add(String.valueOf(st.charAt(i)) + "" + String.valueOf(st.charAt(i + 1)));
        }
           System.out.println("bigram"+def);
           sort(def);
    }
    public static void trigram() {
         def = new ArrayList<>();
         int length;
        if (st.length() % 3 == 0) {
            length = st.length();
        } else {
             length = st.length()%3;
             length = st.length()-length;
        }
        for (int i = 0; i < length; i += 3) {
            def.add(String.valueOf(st.charAt(i)) + ""
                    + String.valueOf(st.charAt(i + 1)+""
                    +String.valueOf(st.charAt(i + 2))));
        }
        System.out.println("trigram"+def);
        sort(def);
    }
    public static void unigram() {
        ArrayList<String> abc = new ArrayList();
         for (int i = 0; i < st.length(); i++) {
                abc.add(String.valueOf(st.charAt(i)));
            }
         System.out.println("list content here: "+abc);
        sort(abc);
        }
    public static void sort(ArrayList<String> abc){
        Map<String,Integer> abbc = new TreeMap<>();
        for(String key:abc){
            if(abbc.containsKey(key)){
                abbc.put(key,abbc.get(key)+1);
            }
            else {
                abbc.put(key,1);
            }
        }
        String key = Collections.max(abbc.entrySet(),
                Comparator.comparingInt(Map.Entry::getValue)).getKey();
        System.out.println("Key is "+key +" Value is "+ abbc.get(key));
    }
}
