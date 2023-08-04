package com.csc207;
import org.junit.*;

import static org.junit.Assert.*;

public class MonsterTest {
    private Monster alien;

    @Before
    public void setUp(){
        System.out.println("Setting up...");
        alien = new Monster("Honk", 100, 60);
    }

    @After
    public void tearDown(){
        System.out.println("Tearing down...");
        alien = null;
    }

    @Test
    public void testGrow(){
        int beforeSize = alien.size();
        alien.grow();
        int afterSize = alien.size();
        assertEquals(afterSize,beforeSize * 2);
    }


}
