package com.homework.version;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static com.homework.version.HomeWorkMath.*;
import static org.assertj.core.api.Assertions.assertThat;

public class HomeWorkMathTests {
List<Integer> listOfIntegers = Arrays.asList(-1, 1, 2, 3, 100, 56, 7, 89, 10);
    @Test
    public void givenListOfNumbersProvidesMin() {
        assertThat(findMin(listOfIntegers,3));
    }

    @Test
    public void givenListOfNumbersProvidesMax() {
        assertThat(findMax(listOfIntegers,9));
    }

    @Test
    public void givenListOfNumbersProvidesAverage() {
       assertThat(findAverage(listOfIntegers));
    }

    @Test
    public void givenListOfNumbersProvidesMedian() {
        assertThat(findMedian(listOfIntegers));
    }

    @Test
    public void givenListOfNumbersProvidesPercentile() {
        assertThat(findPercentile(listOfIntegers,5));
    }
}
