/**
 * Created by user on 4/30/17.
 */
public class Sinus implements IFunctionOfOneDoubleArg {
    private double a;
    private double b;
    private double left;
    private double right;

    public Sinus(double a, double b) {
        this.a=a;
        this.b=b;
    }

    public double getFunctionValue(double x) throws OversteppingException{

            if (x>=left && x<=right){
                return a*Math.sin(b*x);}
            else {throw new OversteppingException();}
        }


    public void getLeftBoard(double m) {
        left=m;
    }

    public void getRightBoard(double n) {
        right=n;
    }
}
