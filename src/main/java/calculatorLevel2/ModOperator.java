package calculatorLevel2;

public class ModOperator implements Operator{
    @Override
    public int operate(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }
}
