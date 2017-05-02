/**
 * Created by user on 5/2/17.
 */
import static junit.framework.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class TestQuadraticFunction {
    @Test
    public void TestGetFunctionValue_normal() throws OversteppingException {
        QuadraticFunction x1 = new QuadraticFunction(4,5,6,7);
        x1.getLeftBoard(2);
        x1.getRightBoard(5);

        assertTrue( Math.abs(651-x1.getFunctionValue(4))< 0.0025);
    }
    @Test
    public void TestGetFunctionValue_outofboards() throws OversteppingException {
        QuadraticFunction x2 = new QuadraticFunction(4,5,6,7);
        x2.getLeftBoard(2);
        x2.getRightBoard(5);

        try{ x2.getFunctionValue(1);
            fail();
        }
        catch (OversteppingException e){

        }
    }

}
