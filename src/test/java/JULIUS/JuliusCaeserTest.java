package JULIUS;

import org.junit.*;

import static org.junit.Assert.*;

public class JuliusCaeserTest {
    @Test
    public void  newJulius_instantiatesCorrectly(){
        JuliusCaeser testObject = new JuliusCaeser();
        assertEquals(true,testObject instanceof JuliusCaeser);

    }
    @Test
    public void newObject_getsShiftValue(){
        JuliusCaeser test = new JuliusCaeser();
        String var = test.JuliusCaeser("kalvin",23);
        assertEquals(23,test.getShiftValue());
    }
    @Test
    public void newObject_getsInputValue_23(){
        JuliusCaeser test = new JuliusCaeser();
        String var = test.JuliusCaeser("kalvin",23);
        assertEquals("kelvin",test.getInput());
    }

}