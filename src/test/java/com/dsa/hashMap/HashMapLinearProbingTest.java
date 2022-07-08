package com.dsa.hashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HashMapLinearProbingTest {
    /**
     * Method under test: {@link HashMapLinearProbing#HashMapLinearProbing(int)}
     */
    @Test
    public void testConstructor() {
        assertFalse((new HashMapLinearProbing(19088743)).isFull());
        assertThrows(NegativeArraySizeException.class, () -> new HashMapLinearProbing(Integer.MIN_VALUE));
    }

    /**
     * Method under test: {@link HashMapLinearProbing#hashing(int)}
     */
    @Test
    public void testHashing() {
        assertEquals(0, (new HashMapLinearProbing(19088743)).hashing(19088743));
        assertThrows(ArithmeticException.class, () -> (new HashMapLinearProbing(0)).hashing(19088743));
        assertEquals(9544311, (new HashMapLinearProbing(19088743)).hashing(Integer.MIN_VALUE));
    }

    /**
     * Method under test: {@link HashMapLinearProbing#insertHash(int)}
     */
    @Test
    public void testInsertHash() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(19088743);
        hashMapLinearProbing.insertHash(19088743);
        assertFalse(hashMapLinearProbing.isEmpty());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#insertHash(int)}
     */
    @Test
    public void testInsertHash2() {
        assertThrows(ArithmeticException.class, () -> (new HashMapLinearProbing(0)).insertHash(19088743));
    }

    /**
     * Method under test: {@link HashMapLinearProbing#insertHash(int)}
     */
    @Test
    public void testInsertHash3() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(19088743);
        hashMapLinearProbing.insertHash(19088743);
        hashMapLinearProbing.insertHash(19088743);
        assertFalse(hashMapLinearProbing.isFull());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#insertHash(int)}
     */
    @Test
    public void testInsertHash4() {
        // TODO: Complete this test.

        (new HashMapLinearProbing(19088743)).insertHash(Integer.MIN_VALUE);
    }

    /**
     * Method under test: {@link HashMapLinearProbing#insertHash(int)}
     */
    @Test
    public void testInsertHash5() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(1);
        hashMapLinearProbing.insertHash(19088743);
        hashMapLinearProbing.insertHash(19088743);
        assertFalse(hashMapLinearProbing.isEmpty());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#insertHash(int)}
     */
    @Test
    public void testInsertHash6() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(2);
        hashMapLinearProbing.insertHash(19088743);
        hashMapLinearProbing.insertHash(19088743);
        assertFalse(hashMapLinearProbing.isEmpty());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#insertHash(int)}
     */
    @Test
    public void testInsertHash7() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(19088743);
        hashMapLinearProbing.insertHash(19088743);
        hashMapLinearProbing.deleteHash(19088743);
        hashMapLinearProbing.insertHash(19088743);
        assertFalse(hashMapLinearProbing.isEmpty());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#deleteHash(int)}
     */
    @Test
    public void testDeleteHash() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(19088743);
        hashMapLinearProbing.deleteHash(19088743);
        assertFalse(hashMapLinearProbing.isFull());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#displayHashtable()}
     */
    @Test
    public void testDisplayHashtable() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(19088743);
        hashMapLinearProbing.displayHashtable();
        assertFalse(hashMapLinearProbing.isFull());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#displayHashtable()}
     */
    @Test
    public void testDisplayHashtable2() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(19088743);
        hashMapLinearProbing.insertHash(19088743);
        hashMapLinearProbing.displayHashtable();
        assertFalse(hashMapLinearProbing.isEmpty());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#findHash(int)}
     */
    @Test
    public void testFindHash() {
        assertEquals(-1, (new HashMapLinearProbing(19088743)).findHash(19088743));
    }

    /**
     * Method under test: {@link HashMapLinearProbing#checkLoadFactor()}
     */
    @Test
    public void testCheckLoadFactor() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(19088743);
        hashMapLinearProbing.checkLoadFactor();
        assertFalse(hashMapLinearProbing.isFull());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#checkLoadFactor()}
     */
    @Test
    public void testCheckLoadFactor2() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(1);
        hashMapLinearProbing.insertHash(19088743);
        hashMapLinearProbing.checkLoadFactor();
        assertFalse(hashMapLinearProbing.isEmpty());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#isFull()}
     */
    @Test
    public void testIsFull() {
        assertFalse((new HashMapLinearProbing(19088743)).isFull());
        assertTrue((new HashMapLinearProbing(0)).isFull());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#isFull()}
     */
    @Test
    public void testIsFull2() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(19088743);
        hashMapLinearProbing.insertHash(19088743);
        assertFalse(hashMapLinearProbing.isFull());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#isFull()}
     */
    @Test
    public void testIsFull3() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(19088743);
        hashMapLinearProbing.insertHash(19088743);
        hashMapLinearProbing.deleteHash(19088743);
        assertFalse(hashMapLinearProbing.isFull());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#isEmpty()}
     */
    @Test
    public void testIsEmpty() {
        assertTrue((new HashMapLinearProbing(19088743)).isEmpty());
    }

    /**
     * Method under test: {@link HashMapLinearProbing#isEmpty()}
     */
    @Test
    public void testIsEmpty2() {
        HashMapLinearProbing hashMapLinearProbing = new HashMapLinearProbing(19088743);
        hashMapLinearProbing.insertHash(19088743);
        assertFalse(hashMapLinearProbing.isEmpty());
    }
}

