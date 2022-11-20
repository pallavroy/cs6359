package com.utd.cs6359.assignment4;

public class Average {
    public float average(int k, int[] list) {
        float average = 0.0f;
        int n = Math.min(k, list.length);
        if (n>0) {
            for (int i=0; i<n; i++) {
                average += list[i];
            }
            average = average/n;
        }
        return average;
    }
}
