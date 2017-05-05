
import static junit.framework.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by user on 4/30/17.
 */
public class TestExponential {
    @Test
    public void TestGetFunctionValue_normal() throws OversteppingException {
        Exponential x1 = new Exponential(4,5,2,5);


        assertTrue( Math.abs(223.3926001326-x1.getFunctionValue(4))< 0.0025);
    }
    @Test
    public void TestGetFunctionValue_outofboards() throws OversteppingException {
        Exponential x2 = new Exponential(4,5,2,5);


        try{ x2.getFunctionValue(1);
            fail();
        }
        catch (OversteppingException e){

        }
    }


}
