import org.junit.Test;
import static org.junit.Assert.*;

//import IntegerSequence;

public class IntegerSequenceTest {
    
    @Test
    public void testLazyCaterer0() {
        IntegerSequence is = new IntegerSequence();
	assertEquals(is.lazy(0),1);
    }
    
    @Test
    public void testLazyCaterer1() {
 
        IntegerSequence is = new IntegerSequence();
        assertEquals(is.lazy(1),2);
    }
    
    @Test
    public void testLazyCaterer2() {
        
        IntegerSequence is = new IntegerSequence();
	assertEquals(is.lazy(50),1276);
    }
    
    @Test
    public void testTriangle0() {
        
        IntegerSequence is = new IntegerSequence();
	assertEquals(is.triangle(0), 0);
    }
    
    @Test
    public void testTriangle1() {
        
        IntegerSequence is = new IntegerSequence();
	assertEquals(is.triangle(1), 1);
    }
    
    @Test
    public void testTriangle2() {
     
        IntegerSequence is = new IntegerSequence();
        assertEquals(is.triangle(60), 1830);
    }
}
