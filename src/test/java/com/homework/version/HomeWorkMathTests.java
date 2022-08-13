package com.homework.version;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static com.homework.version.HomeWorkMath.*;
import static org.assertj.core.api.Assertions.assertThat;

public class HomeWorkMathTests {
    @Test
    public void givenListOfNumbersProvidesMin() {
        assertThat(findMin(Arrays.asList(-1, 1, 2, 3, 100, 56, 7, 89, 10),3));
    }

    @Test
    public void givenListOfNumbersProvidesMax() {
        assertThat(findMax(Arrays.asList(-1, 1, 2, 3, 100, 56, 7, 89, 10),9));
    }

    @Test
    public void givenListOfNumbersProvidesAverage() {
       assertThat(findAverage(Arrays.asList(-1, 1, 2, 3, 100, 56, 7, 89, 10)));
    }

    @Test
    public void givenListOfNumbersProvidesMedian() {
        assertThat(findMedian(Arrays.asList(-1, 1, 2, 3, 100, 56, 7, 89, 10)));
    }

    @Test
    public void givenListOfNumbersProvidesPercentile() {
        assertThat(findPercentile(Arrays.asList(-1, 1, 2, 3, 100, 56, 7, 89, 10),5));
    }
}
