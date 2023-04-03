package Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Homework2Test {
    private Homework2Test homework2Test;
    @BeforeEach
    public void init() {
        homework2Test = new Homework2Test();
    }
    @Test
    public void wordA(){
        assertEquals("a","a");
    }
    @Test
    public void wordB(){
        assertEquals("b","b");
    }
    @Test
    public void wordC(){
        assertEquals("c","c");
    }
}