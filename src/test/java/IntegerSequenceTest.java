import org.junit.Test;
import static org.junit.Assert.*;

import IntegerSequence;

public class IntegerSequenceTest {
    
    @Test
    public void testLazyCaterer0() {
        assertEquals(lazy(0),1);
    }
    
    @Test
    public void testLazyCaterer1() {
        assertEquals(lazy(1),2);
    }
    
    @Test
    public void testLazyCaterer2() {
        assertEquals(lazy(50),1276);
    }
    
    @Test
    public void testTriangle0() {
        
    }
    
    @Test
    public void testTriangle1() {

    }
    
    @Test
    public void testTriangle2() {

    }
}