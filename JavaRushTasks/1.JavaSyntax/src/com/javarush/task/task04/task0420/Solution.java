package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void faner(int kol) throws IOException {
        int[] pri = new int[kol];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < kol; i++) {
            System.out.println("Введите " + (i + 1) + "-е число");
            String sNum = br.readLine();
            pri[i] = Integer.parseInt(sNum);
        }
        Arrays.sort(pri);
        System.out.println(Arrays.toString(pri));
    }
    public static void main(String[] args) throws Exception {

        faner(3);

    }
}
