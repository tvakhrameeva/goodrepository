/**
 * Created by user on 5/5/17.
 */
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
public class TestFunctionalIntegral {
    @Test
    public void TestCalcFunctional_exponential() throws WrongBoardsOfIntegrationException, OversteppingException {
    Exponential fun = new Exponential(4,5,2,5);
    FunctionalIntegral f= new FunctionalIntegral(3,5,6);

       assertTrue( Math.abs(f.calcFunctional(fun)-520.61)<= 0.5);
    }
    @Test
    public void TestCalcFunctional_bad_boards() throws WrongBoardsOfIntegrationException, OversteppingException {
        Exponential fun1 = new Exponential(4,5,2,5);
        FunctionalIntegral f1= new FunctionalIntegral(1,5,6);
        try{
        f1.calcFunctional(fun1);
            fail();
        }
        catch (WrongBoardsOfIntegrationException e){}
    }
}
