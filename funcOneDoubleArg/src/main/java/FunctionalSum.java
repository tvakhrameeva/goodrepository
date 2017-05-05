/**
 * Created by user on 5/2/17.
 */
public class FunctionalSum implements IFunctionalAtOneArg{
    public FunctionalSum(){}
    public double calcFunctional(IFunctionOfOneDoubleArg fun) throws OversteppingException {
        double right=fun.getRightBoard();
        double left=fun.getLeftBoard();
        double mid=(right+left)/2;
        return  fun.getFunctionValue(right) + fun.getFunctionValue(left) + fun.getFunctionValue(mid);
    }
}
