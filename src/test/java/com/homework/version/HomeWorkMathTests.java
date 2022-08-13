package com.homework.version;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static com.homework.version.HomeWorkMath.findMax;
import static com.homework.version.HomeWorkMath.findMin;
import static org.assertj.core.api.Assertions.assertThat;



public class HomeWorkMathTests {
    @Test
    public void whenListIsOfIntegerGetMin() {
        assertThat(findMin(Arrays.asList(-1, 1, 2, 3, 100, 56, 7, 89, 10),3));
    }
    @Test
    public void whenListIsOfIntegerGetMax() {
        assertThat(findMax(Arrays.asList(-1, 1, 2, 3, 100, 56, 7, 89, 10),9));
    }
}
