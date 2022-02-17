package com.javaProgram.Junit;

import org.junit.Test;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;




public class Assertion {

    @Test
    @DisplayName("assert Examples")
    public void assertTests() {
            String str = null;
            String str2 = "some value";
            
            String[] a1 = { "Ankita", "Vanashri" };
            String[] a2 = { "Ankita", "B" };
            
            assertTrue(4 > 0);
            assertFalse(5 < 1);
            assertNull(str);
            assertNotNull(str2);
            
            assertSame(str, str);
            assertNotSame(str, str2);
            
            assertEquals(5, 5);
            assertNotEquals(5, 6);
            
            assertArrayEquals(a1, a2);
            
            assertThrows(RuntimeException.class, () -> {
                    throw new RuntimeException();
            });
    }


}
