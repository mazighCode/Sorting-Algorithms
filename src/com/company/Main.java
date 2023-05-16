package com.company;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int min = 0;
        int max = 50;
        int size = 100;

        /**/
                        // Test tri par Bulles
        ArrayList intList = new ArrayList();

        Random random = new Random();
        for (int i=0; i<size; i++){
            intList.add(min + random.nextInt(max-min));
        }

        System.out.println(intList);
        TriBulles nom = new TriBulles(intList);
        nom.sort();
        System.out.println(intList);
        /**/



        /*
                       // Test Tri par fusion

        LinkedList intList = new LinkedList();

        Random random = new Random();
        for (int i=0; i<size; i++){
            intList.add(min + random.nextInt(max-min));
        }
        System.out.println(intList);

        intList = TriFusion.mergeSort(intList);
        System.out.println(intList);
        */



        /*
                //Test Tri Rapide
        ArrayList intList = new ArrayList();

        Random random = new Random();
        for (int i=0; i<size; i++){
            intList.add(min + random.nextInt(max-min));
        }

        System.out.println(intList);
        TriRapide.triRapide(intList,0,size-1);
        System.out.println(intList);
        */



        /*
                //Test Tri par tas
        int[] myArray = new int[size];
        Random random = new Random();
        for (int i=0; i<size; i++){
            myArray[i]=(min + random.nextInt(max-min));
        }
        System.out.println(Arrays.toString(myArray));
        TriTas heapSort = new TriTas();
        heapSort.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        */
    }
}
