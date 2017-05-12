/**
 * Created by user on 4/21/17.
 */


import junit.framework.TestCase;
import junit.framework.TestSuite;
import static junit.framework.Assert.*;
import org.junit.Test;

public class TestStorageQuPol {

    @Test
    public void testSolveEquation_oneRoot() throws NoRouteException {
        StorageQuPol equation1 = new StorageQuPol(1,2,1);
        assertTrue(equation1.solveEquation()[0] == -1);
        assertTrue(equation1.solveEquation()[1] == null);

    }
    @Test
    public void testSolveEquation_twoRoots() throws NoRouteException {
        StorageQuPol equation2 = new StorageQuPol(1,2,-3);
        assertTrue(equation2.solveEquation()[0] == -3);
        assertTrue(equation2.solveEquation()[1] == 1);
    }

    @Test
    public void testSolveEquation_noRoots_exception1() throws NoRouteException{
        StorageQuPol equation3 = new StorageQuPol(1,2,3);
        try {
            equation3.solveEquation();
            fail();
        }
        catch (NoRouteException e)
        {
        }
    }
    @Test
    public void testSolveEquation_noRoots_exception2() throws NoRouteException{
        StorageQuPol equation4 = new StorageQuPol(0,0,3);
        try {
            equation4.solveEquation();
            fail();
        }
        catch (NoRouteException e)
        {
        }
    }
}
