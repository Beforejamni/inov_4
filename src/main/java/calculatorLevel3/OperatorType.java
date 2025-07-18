package calculatorLevel3;

import java.util.function.DoubleBinaryOperator;

public enum OperatorType {
    ADD('+', (num1, num2) -> (num1 + num2)),
    SUB('-', (num1, num2) -> (num1 - num2)),
    MUL('*', (num1, num2) -> (num1 * num2)),
    DIV('/', (num1, num2) -> (num1 / num2)),
    MOD('%', (num1, num2) -> (num1 % num2));

    private final char operator;

    //과제에서 받아올 수 있는 가장 큰 타입은 double이기에 DoubleBinaryOperator를 이용하였습니다.
    private final DoubleBinaryOperator operate;

    OperatorType(char operator , DoubleBinaryOperator operate){
        this.operator = operator;
        this.operate = operate;
    }


    public char getOperator() {
        return operator;
    }

    public double operate(double firstNum, double secondNum) {
        return operate.applyAsDouble( firstNum, secondNum);
    }

}
