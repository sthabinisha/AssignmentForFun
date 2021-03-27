package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapPractice {

    public Object findValueOf(Map map, Object key) {
       return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        ArrayList<String> res = new ArrayList<String>();
        Set<String> keys = map.keySet();
        int i = 0;
      for(String s: keys){
          if(map.get(s).equals(value)){
              res.add(s);
          }

      }
        return res.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> results = new HashMap<Integer, Integer>();

        for(int i= 1; i<=size; i++){
           results.put(i, fibo(i)) ;
        }
        return results;
    }

    private int fibo(int i) {
        if(i <=2){
            return 1;
        }else{
            int v = fibo(i-1)+ fibo(i-2);
            return v;
        }
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        if (size >= 3) {
            map.put(1, first);
            map.put(2, second);
            for (int i = 3; i <= size; i++) {

                int val = first + second;

                map.put(i, val);
                first = second;
                second = val;
            }

        }else if(size==1){
            map.put(1, first);
        }
        return map;
    }


}
