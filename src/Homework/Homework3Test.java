package Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Homework3Test {
    private Homework3Test homework3Test;
    @BeforeEach
    public void init() {
        homework3Test = new Homework3Test();
    }
    @Test
    public void peopleNames(){
        assertEquals("Vasia","Vasia");
    }
    @Test
    public void peopleName_Eddy(){
        assertEquals("Eddy","Eddy");
    }
    @Test
    public void peopleNames_Mary(){
        assertEquals("Mary","Mary");
    }


}