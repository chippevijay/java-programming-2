package com.vijay;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Replace {
    static void changeArr(int[] input)
    {

        int[] newArray = Arrays.copyOfRange(input, 0,input.length);
        Arrays.sort(newArray);
        Map<Integer, Integer> ranks  = new HashMap<>();
        int rank = 1;
        for (int element : newArray) {
            if (ranks.get(element) == null) {
                ranks.put(element, rank);
                rank++;
            }
        }

        for (int index = 0; index < input.length; index++) {

            int element = input[index];
            input[index]
                    = ranks.get(input[index]);

        }
    }


    public static void main(String[] args)
    {

        int[] arr = { 100, 2, 70, 2 };


        changeArr(arr);


        System .out .println(Arrays.toString(arr));
    }
}
