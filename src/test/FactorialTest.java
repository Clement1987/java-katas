import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

   @Test
    public void testInteger() throws Exception {
        Assert.assertEquals(1,Factorial.facto(1));
        Assert.assertEquals(6,Factorial.facto(3));
        Assert.assertEquals(24,Factorial.facto(4));
        Assert.assertEquals(120,Factorial.facto(5));
    }
   @Test
    public void testZero() throws Exception {
        Assert.assertEquals(1,Factorial.facto(0));
    }
}
