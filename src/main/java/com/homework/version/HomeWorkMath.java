package com.homework.version;

import java.util.List;
import java.util.NoSuchElementException;


public class HomeWorkMath {

    public static Integer findMin(List<Integer> listOfIntegers,Integer quantifier )
    {
        Integer min = listOfIntegers
                .stream()
                .mapToInt(i -> i)
                .limit(quantifier)
                .min().orElseThrow(NoSuchElementException::new);
        System.out.println("Min-->  = "+min);
        return min;
    }
    public static Integer findMax(List<Integer> listOfIntegers,Integer quantifier )
    {
        Integer max = listOfIntegers
                .stream()
                .mapToInt(i -> i)
                .limit(quantifier)
                .max().orElseThrow(NoSuchElementException::new);
        System.out.println("Max-->  = "+max);
        return max;
    }
}
