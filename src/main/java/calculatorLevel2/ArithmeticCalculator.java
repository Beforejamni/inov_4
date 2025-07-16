package calculatorLevel2;

import calculatorLevel3.AddOperator;
import calculatorLevel3.DivideOperator;
import calculatorLevel3.MultiplyOperator;
import calculatorLevel3.SubtractOperator;

import java.sql.PreparedStatement;
import java.util.Queue;

public class ArithmeticCalculator extends Calculator {

    private Queue<String> results;

    public ArithmeticCalculator(Queue<String> results){
        this.results = results;
    }


    public int calculate(int firstNum , int secondNum, char operator )throws ArithmeticException {

        switch (operator) {

            case '+':
                return new AddOperator().operate(firstNum ,secondNum);

            case '-':
                return new SubtractOperator().operate(firstNum, secondNum);

            case '*':
                return new MultiplyOperator().operate(firstNum, secondNum);

            case '/':
                return new DivideOperator().operate(firstNum, secondNum);

            default:
                throw new ArithmeticException("계산할 수 없습니다.");
        }
    }

    @Override
    public void addResult(String result) {
        this.results.add(result);
    }

    @Override
    public void removeResult() {
        results.remove();
    }

    @Override
    public void inquiryResults() {
        System.out.print("results : ");
        for (String result : results) {
            System.out.println(result + ", ");
        }
        System.out.println();
    }

    public Queue<String> getResults() {
        return results;
    }
}
