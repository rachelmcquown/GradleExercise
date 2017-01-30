import org.junit.Test;
import static org.junit.Assert.*;

//import IntegerSequence;

public class IntegerSequenceTest {
    
    @Test
    public void testLazyCaterer0() {
        assertEquals(IntegerSequence.lazy(0),1);
    }
    
    @Test
    public void testLazyCaterer1() {
        assertEquals(IntegerSequence.lazy(1),2);
    }
    
    @Test
    public void testLazyCaterer2() {
        assertEquals(IntegerSequence.lazy(50),1276);
    }
    
    @Test
    public void testTriangle0() {
        assertEquals(IntegerSequence.triangle(0), 0);
    }
    
    @Test
    public void testTriangle1() {
        assertEquals(IntegerSequence.triangle(1), 1);
    }
    
    @Test
    public void testTriangle2() {
        assertEquals(IntegerSequence.triangle(10), 55);
    }
}
