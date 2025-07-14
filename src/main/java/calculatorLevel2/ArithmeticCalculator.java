package calculatorLevel2;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator {


    public ArithmeticCalculator(Queue<String> results){
       super(results);
    }

    public int calculate(int firstNum , int secondNum , char operator)throws ArithmeticException {

        switch (operator) {

            case '+':
                return Math.addExact(firstNum, secondNum);

            case '-':
                return firstNum - secondNum;

            case '*':
                return Math.multiplyExact(firstNum, secondNum);

            case '/':
                return firstNum / secondNum;

            default:
                throw new ArithmeticException("계산할 수 없습니다.");
        }
    }



}
