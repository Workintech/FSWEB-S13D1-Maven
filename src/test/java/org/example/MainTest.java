package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ResultAnalyzer.class)
class MainTest {

    @Test
    public void testShouldWakeUp(){
        assertTrue(Main.shouldWakeUp(true, 1));
        assertFalse(Main.shouldWakeUp(false, 2));
        assertFalse(Main.shouldWakeUp(true, 8));
        assertFalse(Main.shouldWakeUp(true, -1));
    }

    @Test
    public void hasTeenTest(){
        assertTrue(Main.hasTeen(9, 99, 19));
        assertTrue(Main.hasTeen(23, 15, 42));
        assertFalse(Main.hasTeen(22, 23, 34));
    }

    @Test
    public void testIsCatPlaying(){
        assertFalse(Main.isCatPlaying(true, 10));
        assertFalse(Main.isCatPlaying(false, 36));
        assertTrue(Main.isCatPlaying(false, 35));
    }

    @Test
    public void testArea(){
        assertEquals(20, Main.area(5.0, 4.0));
        assertEquals(-1, Main.area(-1.0, 4.0));
    }

    @Test
    public void testSingleArea(){
        assertEquals(78.53981633974483, Main.area(5.0));
        assertEquals(-1, Main.area(-1.0));
    }

}