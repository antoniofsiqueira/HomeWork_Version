package com.homework.version;

import java.util.List;
import java.util.NoSuchElementException;


public class HomeWorkMath {

    public static Integer findMin(List<Integer> listOfIntegers,Integer quantifier ) {
        Integer min = listOfIntegers
                .stream()
                .mapToInt(i -> i)
                .limit(quantifier)
                .min().orElseThrow(NoSuchElementException::new);
        System.out.println("Min-->  = "+min);
        return min;
    }

    public static Integer findMax(List<Integer> listOfIntegers,Integer quantifier ) {
        Integer max = listOfIntegers
                .stream()
                .mapToInt(i -> i)
                .limit(quantifier)
                .max().orElseThrow(NoSuchElementException::new);
        System.out.println("Max-->  = "+max);
        return max;
    }

    public static double findAverage(List<Integer> listOfIntegers) {
        double average = listOfIntegers
                .stream()
                .mapToInt(i -> i)
                .average().orElseThrow(NoSuchElementException::new);

        System.out.println("Average-->  = "+average);
        return  average;
    }

    public static double findMedian(List<Integer> listOfIntegers){
        int size = listOfIntegers.size();

        double median = listOfIntegers
                .stream()
                .mapToInt(i-> i)
                .sorted()
                .skip((size-1)/2).limit(2-size%2).average().orElseThrow(NoSuchElementException::new);
        System.out.println("Median-->  = "+median);
        return median;

    }

    public static double findPercentile(List<Integer> listOfIntegers, Integer quantifier){

        double percentile = listOfIntegers.stream()
                .mapToInt(i-> i)
                .limit(quantifier)
                .summaryStatistics()
                .getAverage();
        System.out.println("Percentile-->  = "+percentile);
        return percentile;
    }
}
