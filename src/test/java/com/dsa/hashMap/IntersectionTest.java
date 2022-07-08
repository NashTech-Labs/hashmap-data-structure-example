package com.dsa.hashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.junit.Test;

public class IntersectionTest {
    /**
     * Method under test: {@link Intersection#intersection(int[], int[])}
     */
    @Test
    public void testIntersection() {
        List<Integer> actualIntersectionResult = Intersection.intersection(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1});
        assertEquals(4, actualIntersectionResult.size());
        assertEquals(1, (int) actualIntersectionResult.get(0));
        assertEquals(1, (int) actualIntersectionResult.get(1));
        assertEquals(1, (int) actualIntersectionResult.get(2));
        assertEquals(1, (int) actualIntersectionResult.get(3));
    }

    /**
     * Method under test: {@link Intersection#intersection(int[], int[])}
     */
    @Test
    public void testIntersection2() {
        List<Integer> actualIntersectionResult = Intersection.intersection(new int[]{4, 1, 1, 1}, new int[]{1, 1, 1, 1});
        assertEquals(3, actualIntersectionResult.size());
        assertEquals(1, (int) actualIntersectionResult.get(0));
        assertEquals(1, (int) actualIntersectionResult.get(1));
        assertEquals(1, (int) actualIntersectionResult.get(2));
    }

    /**
     * Method under test: {@link Intersection#intersection(int[], int[])}
     */
    @Test
    public void testIntersection3() {
        assertTrue(Intersection.intersection(null, new int[]{1, 1, 1, 1}).isEmpty());
    }

    /**
     * Method under test: {@link Intersection#intersection(int[], int[])}
     */
    @Test
    public void testIntersection4() {
        assertTrue(Intersection.intersection(new int[]{}, new int[]{1, 1, 1, 1}).isEmpty());
    }

    /**
     * Method under test: {@link Intersection#intersection(int[], int[])}
     */
    @Test
    public void testIntersection5() {
        assertTrue(Intersection.intersection(new int[]{4, 4, 4, 4, 4, 4, 4, 4}, new int[]{1, 1, 1, 1}).isEmpty());
    }

    /**
     * Method under test: {@link Intersection#intersection(int[], int[])}
     */
    @Test
    public void testIntersection6() {
        assertTrue(Intersection.intersection(new int[]{1, 1, 1, 1}, null).isEmpty());
    }

    /**
     * Method under test: {@link Intersection#intersection(int[], int[])}
     */
    @Test
    public void testIntersection7() {
        assertTrue(Intersection.intersection(new int[]{1, 1, 1, 1}, new int[]{}).isEmpty());
    }
}

