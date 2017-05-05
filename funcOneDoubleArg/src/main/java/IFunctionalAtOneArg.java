/**
 * Created by user on 5/2/17.
 */
public interface IFunctionalAtOneArg<T extends IFunctionOfOneDoubleArg > {
    public  double calcFunctional(T fun) throws OversteppingException, WrongBoardsOfIntegrationException;
}
