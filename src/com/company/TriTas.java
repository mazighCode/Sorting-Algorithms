package com.company;

public class TriTas {

    public void sort(int[] arr) {
        int size = arr.length;

        // Construire le tas
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }

        for (int i = size-1; i >= 0; i--) {
            //arr[0] est la racine et est l'élément le plus grand du tas
            int tempo = arr[0];
            arr[0] = arr[i];
            arr[i] = tempo;

            //On appelle heapify sur le nouveau tas qui est réduit
            heapify(arr, i, 0);
        }
    }

     void heapify(int [] arr, int heapSize, int i){
        int biggest = i;
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;

        if (leftChild < heapSize && arr[leftChild] > arr[biggest]){
            biggest = leftChild;
        }
        if (rightChild < heapSize && arr[rightChild] > arr[biggest]){
            biggest = rightChild;
        }

        if (biggest != i){
            int x = arr[i];
            arr[i] = arr[biggest];
            arr[biggest] = x;
            heapify(arr, heapSize, biggest);
        }
    }

}





