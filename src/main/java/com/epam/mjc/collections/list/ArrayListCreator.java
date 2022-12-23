package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 1;i<sourceList.size()+1;i++){
                if(i%3==0){
                    arrayList.add(sourceList.get(i-1));
                    arrayList.add(sourceList.get(i-1));
                }

        }
        return arrayList;
    }
}
