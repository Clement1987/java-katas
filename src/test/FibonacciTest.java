import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testDecimal() throws Exception {
        Assert.assertEquals(3,Fibonacci.fiboRecursive(4));
        Assert.assertEquals(5,Fibonacci.fiboRecursive(5));
        Assert.assertEquals(55,Fibonacci.fiboRecursive(10));
    }
    
    @Test
    public void testZero() throws Exception {
        Assert.assertEquals(0,Fibonacci.fiboRecursive(0));
    }
    
    @Test
    public void testOne() throws Exception {
        Assert.assertEquals(1,Fibonacci.fiboRecursive(1));
    }
    
}
