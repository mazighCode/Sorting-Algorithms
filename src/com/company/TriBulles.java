package com.company;

import java.util.ArrayList;

public class TriBulles {

    public ArrayList TriBullesList = new ArrayList();

    public TriBulles(ArrayList TriBullesList){
        this.TriBullesList = TriBullesList;
    }

    public void sort(){
        for (int i = TriBullesList.size()-1; i > 0; i--){
            for (int j=0; j < i; j++){
                if ((int)TriBullesList.get(j) > (int)TriBullesList.get(j+1)){
                    permut(TriBullesList, j, j+1);
                }
            }
        }
    }

    public void permut(ArrayList MyList, int i, int j){
        int tempo = (int)MyList.get(i);
        MyList.set(i, MyList.get(j));
        MyList.set(j, tempo);
    }

}
