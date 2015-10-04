/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo arriola
 */
public class PriorityQueueTest {
    
    public PriorityQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFirst method, of class PriorityQueue.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        PriorityQueue instance = new PriorityQueueImpl();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class PriorityQueue.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        PriorityQueue instance = new PriorityQueueImpl();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class PriorityQueue.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object value = null;
        PriorityQueue instance = new PriorityQueueImpl();
        instance.add(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class PriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PriorityQueue instance = new PriorityQueueImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class PriorityQueue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PriorityQueue instance = new PriorityQueueImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class PriorityQueue.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        PriorityQueue instance = new PriorityQueueImpl();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class PriorityQueueImpl implements PriorityQueue {

        public E getFirst() {
            return null;
        }

        public E remove() {
            return null;
        }

        public void add(E value) {
        }

        public boolean isEmpty() {
            return false;
        }

        public int size() {
            return 0;
        }

        public void clear() {
        }
    }
    
}
