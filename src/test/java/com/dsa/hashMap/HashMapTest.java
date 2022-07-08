package com.dsa.hashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class HashMapTest {
    /**
     * Method under test: {@link HashMap#HashMap(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testConstructor() {
        // TODO: Complete this test.

        new HashMap(19088743);
    }

    /**
     * Method under test: {@link HashMap#HashMap(int)}
     */
    @Test
    public void testConstructor2() {
        assertThrows(NegativeArraySizeException.class, () -> new HashMap(-1));
    }

    /**
     * Method under test: {@link HashMap#hashing(int)}
     */
    @Test
    public void testHashing() {
        assertEquals(0, (new HashMap(19088743)).hashing(19088743));
        assertThrows(ArithmeticException.class, () -> (new HashMap(0)).hashing(19088743));
    }

    /**
     * Method under test: {@link HashMap#insertHash(int)}
     */
    @Test
    public void testInsertHash() {

        // TODO: Complete this test.

        (new HashMap(19088743)).insertHash(19088743);
    }

    /**
     * Method under test: {@link HashMap#insertHash(int)}
     */
    @Test
    public void testInsertHash2() {
        assertThrows(ArithmeticException.class, () -> (new HashMap(0)).insertHash(19088743));
    }

    /**
     * Method under test: {@link HashMap#insertHash(int)}
     */
    @Test
    public void testInsertHash3() {

        // TODO: Complete this test.

        HashMap hashMap = new HashMap(19088743);
        hashMap.insertHash(19088743);
        hashMap.insertHash(19088743);
    }

    /**
     * Method under test: {@link HashMap#insertHash(int)}
     */
    @Test
    public void testInsertHash4() {

        // TODO: Complete this test.

        HashMap hashMap = new HashMap(19088743);
        hashMap.insertHash(19088743);
        hashMap.insertHash(19088743);
        hashMap.insertHash(19088743);
    }

    /**
     * Method under test: {@link HashMap#deleteHash(int)}
     */
    @Test
    public void testDeleteHash() {

        // TODO: Complete this test.

        (new HashMap(19088743)).deleteHash(19088743);
    }

    /**
     * Method under test: {@link HashMap#deleteHash(int)}
     */
    @Test
    public void testDeleteHash2() {
        assertThrows(ArithmeticException.class, () -> (new HashMap(0)).deleteHash(19088743));
    }

    /**
     * Method under test: {@link HashMap#deleteHash(int)}
     */
    @Test
    public void testDeleteHash3() {

        // TODO: Complete this test.
        HashMap hashMap = new HashMap(19088743);
        hashMap.insertHash(19088743);
        hashMap.deleteHash(19088743);
    }

    /**
     * Method under test: {@link HashMap#displayHashtable()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisplayHashtable() {

        // TODO: Complete this test.
        // Arrange
        // TODO: Populate arranged inputs
        HashMap hashMap = null;

        // Act
        hashMap.displayHashtable();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: default or parameterless constructor of {@link HashMap.LinkedList}
     */
    @Test
    public void testLinkedListConstructor() {
        assertTrue((new HashMap.LinkedList()).isEmpty());
    }

    /**
     * Method under test: {@link HashMap.LinkedList#delete(int)}
     */
    @Test
    public void testLinkedListDelete() {
        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.delete(1);
        assertTrue(linkedList.isEmpty());
    }

    /**
     * Method under test: {@link HashMap.LinkedList#delete(int)}
     */
    @Test
    public void testLinkedListDelete2() {
        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(1);
        linkedList.delete(1);
        assertTrue(linkedList.isEmpty());
    }

    /**
     * Method under test: {@link HashMap.LinkedList#delete(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLinkedListDelete3() {

        // TODO: Complete this test.

        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(0);
        linkedList.delete(1);
    }

    /**
     * Method under test: {@link HashMap.LinkedList#delete(int)}
     */
    @Test
    public void testLinkedListDelete4() {

        // TODO: Complete this test.

        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(-1);
        linkedList.insert(1);
        linkedList.delete(1);
    }

    /**
     * Method under test: {@link HashMap.LinkedList#delete(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLinkedListDelete5() {

        // TODO: Complete this test.

        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(-1);
        linkedList.insert(0);
        linkedList.delete(1);
    }

    /**
     * Method under test: {@link HashMap.LinkedList#delete(int)}
     */
    @Test
    public void testLinkedListDelete6() {

        // TODO: Complete this test.

        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(-1);
        linkedList.insert(-1);
        linkedList.insert(1);
        linkedList.delete(1);
    }

    /**
     * Method under test: {@link HashMap.LinkedList#delete(int)}
     */
    @Test
    public void testLinkedListDelete7() {

        // TODO: Complete this test.

        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(-1);
        linkedList.insert(1);
        linkedList.insert(1);
        linkedList.delete(1);
    }

    /**
     * Method under test: {@link HashMap.LinkedList#display()}
     */
    @Test
    public void testLinkedListDisplay() {
        assertEquals("null", (new HashMap.LinkedList()).display());
    }

    /**
     * Method under test: {@link HashMap.LinkedList#display()}
     */
    @Test
    public void testLinkedListDisplay2() {
        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(1);
        assertEquals("1->null", linkedList.display());
    }

    /**
     * Method under test: {@link HashMap.LinkedList#findKey(int)}
     */
    @Test
    public void testLinkedListFindKey() {
        assertNull((new HashMap.LinkedList()).findKey(1));
    }

    /**
     * Method under test: {@link HashMap.LinkedList#findKey(int)}
     */
    @Test
    public void testLinkedListFindKey2() {

        // TODO: Complete this test.

        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(1);
        linkedList.findKey(1);
    }

    /**
     * Method under test: {@link HashMap.LinkedList#findKey(int)}
     */
    @Test
    public void testLinkedListFindKey3() {
        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(0);
        assertNull(linkedList.findKey(1));
    }

    /**
     * Method under test: {@link HashMap.LinkedList#findKey(int)}
     */
    @Test
    public void testLinkedListFindKey4() {

        // TODO: Complete this test.

        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(-1);
        linkedList.insert(1);
        linkedList.findKey(1);
    }

    /**
     * Method under test: {@link HashMap.LinkedList#insert(int)}
     */
    @Test
    public void testLinkedListInsert() {
        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(1);
        assertFalse(linkedList.isEmpty());
    }

    /**
     * Method under test: {@link HashMap.LinkedList#insert(int)}
     */
    @Test
    public void testLinkedListInsert2() {

        // TODO: Complete this test.

        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(1);
        linkedList.insert(1);
    }

    /**
     * Method under test: {@link HashMap.LinkedList#insert(int)}
     */
    @Test
    public void testLinkedListInsert3() {

        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(1);
        linkedList.insert(1);
        linkedList.insert(1);
    }

    /**
     * Method under test: {@link HashMap.LinkedList#isEmpty()}
     */
    @Test
    public void testLinkedListIsEmpty() {
        assertTrue((new HashMap.LinkedList()).isEmpty());
    }

    /**
     * Method under test: {@link HashMap.LinkedList#isEmpty()}
     */
    @Test
    public void testLinkedListIsEmpty2() {
        HashMap.LinkedList linkedList = new HashMap.LinkedList();
        linkedList.insert(1);
        assertFalse(linkedList.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link HashMap.Node#Node(int)}
     *   <li>{@link HashMap.Node#setNext(HashMap.Node)}
     *   <li>{@link HashMap.Node#getKey()}
     *   <li>{@link HashMap.Node#getNext()}
     * </ul>
     */
    @Test
    public void testNodeConstructor() {
        HashMap.Node actualNode = new HashMap.Node(1);
        HashMap.Node node = new HashMap.Node(1);
        actualNode.setNext(node);
        assertEquals(1, actualNode.getKey());
        HashMap.Node next = actualNode.getNext();
        assertEquals(1, next.getKey());
        assertSame(node, next);
        assertNull(next.getNext());
    }
}

