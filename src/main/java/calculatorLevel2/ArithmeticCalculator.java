package calculatorLevel2;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator {


    public ArithmeticCalculator(Queue<String> results){
       super(results);
    }


    //먼가 책임이 많아보입니다,,,
    public int calculate(int firstNum , int secondNum , char operator)throws ArithmeticException {

        switch (operator) {

            case '+':
                return new AddOperator().operate(firstNum ,secondNum, operator);

            case '-':
                return new SubtractOperator().operate(firstNum, secondNum, operator);

            case '*':
                return new MultiplyOperator().operate(firstNum, secondNum, operator);

            case '/':
                return new DivideOperator().operate(firstNum, secondNum, operator);

            default:
                throw new ArithmeticException("계산할 수 없습니다.");
        }
    }



}
