package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {

    @Test
    void exist() {
        MyClass myClass = new MyClass();

        String[] list1 = {"1", "2", "3"};
        String[] list2 = {"4", "five", "6"};
        String[] list3 = {};

        assertTrue(myClass.exist(2, list1));          // should be true
        assertFalse(myClass.exist(5, list1));         // should be false
        assertTrue(myClass.exist(6, list2));          // should be true
        assertFalse(myClass.exist(5, list2));         // should be false
        assertFalse(myClass.exist(1, list3));         // should be false (empty list)
    }
}
