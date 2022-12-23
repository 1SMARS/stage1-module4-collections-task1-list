package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        
    ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0;i<sourceList.size();i++){
            arrayList.add(Integer.parseInt(sourceList.get(i)));
        }
        Collections.sort(arrayList,new ListComparator());
        sourceList.clear();
        ArrayList<String> finalArrayList = new ArrayList<>();
        for(int i = 0;i<arrayList.size();i++){
            finalArrayList.add(String.valueOf(arrayList.get(i)));
        }
        sourceList.addAll(finalArrayList);

    }
}

class ListComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer first, Integer second) {
        return Integer.compare((int)Math.pow(5*first,2)+3,(int)Math.pow(5*second,2)+3);
    }
}
