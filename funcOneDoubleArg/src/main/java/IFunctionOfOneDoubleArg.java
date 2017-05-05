/**
 * Created by user on 4/29/17.
 */
public interface IFunctionOfOneDoubleArg {
    double getFunctionValue(double x) throws OversteppingException;
    double getLeftBoard();
    double getRightBoard();
}
