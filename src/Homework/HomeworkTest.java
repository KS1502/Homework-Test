package Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {
    private HomeworkTest homeworkTest;

    @BeforeEach
    public void init(){
        homeworkTest= new HomeworkTest();

    }
    @Test
    public void wordTest(){
        assertEquals("a","a");
    }
    @Test
    public void wordTest_B(){
        assertEquals("b","b");
    }
    @Test
    public void wordTest_AB(){
        assertEquals("ab","ab");
    }
    @Test
    public void wordTest_Hi(){
        assertEquals("Hi","Hi");
    }
    @Test
    public void wordTest_There(){
        assertEquals("There","There");
    }
    @Test
    public void wordTest_HiThere(){
        assertEquals("HiThere","HiThere");
    }


}