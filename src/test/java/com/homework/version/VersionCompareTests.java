package com.homework.version;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class VersionCompareTests {

    @Test
    public void givenVersionStrings_thenCompareVersions() {
        assertTrue(VersionCompare.compareVersions("1.0.1", "1.1.2") < 0);
        assertTrue(VersionCompare.compareVersions("1.0.1", "1.10") < 0);
        assertTrue(VersionCompare.compareVersions("1.1.2", "1.0.1") > 0);
        assertTrue(VersionCompare.compareVersions("1.1.2", "1.2") < 0);
        assertEquals(0, VersionCompare.compareVersions("1.3.0", "1.3"));
    }
}
