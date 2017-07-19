package com.example.java;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int counter = 0;

        Arrays.sort(ar);
        int tallest = ar[n - 1];
        for (int i = n; i > 0; i--) {
            if (tallest == ar[i - 1]) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
