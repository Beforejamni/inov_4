package calculatorLevel3;

public interface Operator {

    public <T extends Number> double operate(T firstNum, T secondNum);
}
