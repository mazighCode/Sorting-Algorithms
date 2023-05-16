package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class TriFusion {

    public static LinkedList mergeSort(LinkedList list) {
        LinkedList result = new LinkedList();
        if (list.size() > 1) {
            result = merge(mergeSort(decompose(list).get(0)), mergeSort(decompose(list).get(1)));
            return result;
        }
       return list;
    }

    public static ArrayList<LinkedList> decompose(LinkedList myList){
        LinkedList firstList = new LinkedList();
        LinkedList secondList = new LinkedList();
        ArrayList resultList = new ArrayList();
        for (int i=0; i<myList.size(); i++){
            if (i%2 == 0){
                firstList.add(myList.get(i));
            } else {
                secondList.add(myList.get(i));
            }
        }
        resultList.add(firstList);
        resultList.add(secondList);
        return resultList;
    }

    public static LinkedList merge(LinkedList list1, LinkedList list2){
        LinkedList resultList = new LinkedList();
        int j=0;
        int k=0;
        while (j != list1.size() & k != list2.size()){
            if ((int)list1.get(j) < (int)list2.get(k)){
                resultList.add(list1.get(j));
                j++;
            } else {
                resultList.add(list2.get(k));
                k++;
            }
        }
        if (j == list1.size()){
            while (k != list2.size()){
            resultList.add(list2.get(k));
            k++;}
        } else {
            while (j != list1.size()){
            resultList.add(list1.get(j));
            j++;}
        }
        return resultList;
    }
}
