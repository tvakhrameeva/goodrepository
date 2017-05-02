/**
 * Created by user on 4/30/17.
 */
public class QuadraticFunction implements IFunctionOfOneDoubleArg {
    private double a;
    private double b;
    private double c;
    private double d;
    private double left;
    private double right;

    public QuadraticFunction(double a, double b,double c,double d) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;

    }

    public double getFunctionValue(double x) throws OversteppingException {
        if (x>=left && x<=right){
            return (a*x+b)*(c*x+d);}
        else {throw new OversteppingException();}
    } {

    }

    public void getLeftBoard(double m) {
        left=m;
    }

    public void getRightBoard(double n) {
        right=n;
    }
}
