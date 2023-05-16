package com.company;

import java.util.ArrayList;

public class TriRapide {

    static void triRapide(ArrayList arr, int min, int max) {
        if (min < max) {
            int pi = partition(arr, min, max);
            triRapide(arr, min, pi - 1);
            triRapide(arr, pi + 1, max);
        }
    }

    static void permuter(ArrayList arr, int i, int j) {
        int temp = (int) arr.get(i);
        arr.set(i,arr.get(j)) ;
        arr.set(j,temp);
    }

    static int partition(ArrayList arr, int min, int max) {
        int pivot = (int) arr.get(max);
        int i = (min - 1);

        for(int j = min; j <= max - 1; j++) {
            if ( (int) arr.get(j) < pivot) {
                i++;
                permuter(arr, i, j);
            }
        }
        permuter(arr, i + 1, max);
        return (i + 1);
    }
}