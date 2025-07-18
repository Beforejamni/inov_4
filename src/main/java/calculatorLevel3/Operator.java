package calculatorLevel3;

public interface Operator {

    <T extends Number> double operate(T firstNum, T secondNum);
}
