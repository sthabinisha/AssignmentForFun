package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            list1.addAll(list2);



        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Integer res = 0;
       for(int i = 0; i< list1.size(); i++){
           res += list1.get(i);

       }
        for(int i = 0; i< list2.size(); i++){
            res += list2.get(i);

        }
        return res;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
       if(original.contains(toRemove)){
           original.remove(original.indexOf(toRemove));
       }
       return original;
    }

    public boolean happyList(ArrayList<String> original) {
        return false;
    }
}
