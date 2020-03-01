package com.example.algorithm;

public class Answer {

    final static int limit = 256;

    public static int maxChar(String str, int n) {
        int count[] = new int[limit];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }
        int maxDistinct = 0;
        for (int i = 0; i < limit; i++) {
            if (count[i] != 0) {
                maxDistinct++;
            }
        }
        return maxDistinct;
    }

    public static int shortestSubstring(String input) {
        int n = input.length();
        int max = maxChar(input, n);
        int minl=n;
        for (int i = 0; i <=  n; i++) {
            for (int j = 0; j <= n; j++) {
                String subString = null;
                if(i<j)
                    subString = input.substring(i, j);
                else
                    subString = input.substring(j, i);
                int subsLenght = subString.length();
                int subDistinctChar = maxChar(subString, subsLenght);
                if (subsLenght < minl && max == subDistinctChar) {
                    minl = subsLenght;
                }
            }
        }
        return minl;
    }



}
