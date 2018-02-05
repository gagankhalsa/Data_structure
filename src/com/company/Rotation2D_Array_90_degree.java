package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Rotation2D_Array_90_degree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int[][] abc = new int[rows][columns];
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                abc[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                System.out.print(abc[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Rotation of Array ");
        int[][] cba=new int[rows][columns];
            for (int i=0;i<rows;i++)
        {
             int k=0;
            for (int j=columns-1;j>=0;j--)
            {
                   cba[i][k] = abc[j][i];
                   k++;
                }
            }



        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                System.out.print(cba[i][j]+" ");
            }
            System.out.println();
        }
    }

}
