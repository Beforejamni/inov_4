package calculatorLevel3;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator {

    private final Queue<String> results;

    public ArithmeticCalculator(Queue<String> results){
        this.results = results;
    }


    public Number calculate(Number firstNum , Number secondNum, char operator )throws ArithmeticException {

        OperatorType[] operatorTypes = OperatorType.values();

        for(OperatorType operatorType : operatorTypes){
            if(operatorType.getOperator() == operator) {
                return operatorType.getOperate().operate(firstNum, secondNum);
            }
        }
        throw new ArithmeticException("계산할 수 없습니다.");
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
            System.out.print(result + ", ");
        }
        System.out.println();
    }

    public Queue<String> getResults() {
        return results;
    }
}
