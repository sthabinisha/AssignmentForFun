package DansDilemma;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DansDilemma {
    double data[]=new double[2];
    Set<Double> res = new HashSet<Double>();

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        if(input1==0d || input2==0d){
            return 1;
        }
        Set<Double> res = new HashSet<Double>();
        res.add((input1+input2));
        res.add((input1*input2));
        res.add( (input1/input2));
        res.add( (input1-input2));
        res.add( (input2/input1));
        res.add( (input2-input1));

        return res.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        if(input1==0d || input2==0d||input3==0d){
            return 1;
        }

        double [] arr= {input1, input2, input3};
        printCombination(arr, arr.length);

        return res.size();
    }

    private void printCombination(double[] arr, int n) {
        combinationUtil(arr, data, 0, n-1, 0, 2);

    }

    public void combinationUtil(double[] arr, double[] data, int start,
                                int end, int index, int r)
    {

        // Current combination is ready to be printed, print it
        if (index == r)
        {
            res.add(data[0]+data[1]);

            res.add(data[0]*data[1]);

            res.add(data[0]/data[1]);
            res.add(data[1]/data[0]);
            res.add(data[0]-data[1]);
            res.add(data[1]-data[0]);
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }

    }


    public Integer dilemmaOfN(Double... args){

    double[] d = new double[args.length];
        for(int i = 0; i<args.length; i++){

            d[i]= args[i];
        }
        res.clear();
        printCombination(d, d.length);

        return res.size();
    }
}
