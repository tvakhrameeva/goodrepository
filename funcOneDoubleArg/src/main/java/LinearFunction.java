/**
 * Created by user on 4/30/17.
 */
public class LinearFunction implements IFunctionOfOneDoubleArg{
    private double a=3;
    private double b=8;
    private double left;
    private double right;

    public LinearFunction(double a, double b) {
        this.a=a;
        this.b=b;
    }


    public double getFunctionValue(double x) throws OversteppingException {
        if (x>=left && x<=right){
        return a*x+b;}
        else {throw new OversteppingException();}
    }

    public void getLeftBoard(double m) {
        left=m;
    }

    public void getRightBoard(double n) {
        right=n;
    }
}
