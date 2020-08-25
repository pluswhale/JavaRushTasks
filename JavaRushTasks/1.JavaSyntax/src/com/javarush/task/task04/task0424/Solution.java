package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b){
            System.out.println("3");
        }else if (a == c){
            System.out.println("2");
        }else if ( b == c){
            System.out.println("1");
        }

    }
}
