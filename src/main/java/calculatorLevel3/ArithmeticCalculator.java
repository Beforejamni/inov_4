package calculatorLevel3;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator {

    private final Queue<Double> results;

    public ArithmeticCalculator(Queue<Double> results){
        this.results = results;
    }


    public <T extends Number>  double calculate(double firstNum , double  secondNum, char operator )throws ArithmeticException {

        OperatorType[] operatorTypes = OperatorType.values();

        for(OperatorType operatorType : operatorTypes){
            if(operatorType.getOperator() == operator) {
                return operatorType.operate(firstNum, secondNum);
            }
        }
        throw new ArithmeticException("계산할 수 없습니다.");
    }

    public Queue<Double> getResults() {
        return results;
    }

    @Override
    public void addResult(double result) {
        this.results.add(result);
    }

    @Override
    public void removeResult() {
        results.remove();
    }

    @Override
    public void inquiryResults() {
        System.out.print("results : ");
        for (double result : results) {
            System.out.print(result + ", ");
        }
        System.out.println();
    }

    @Override
    public void inquiryResultsOverScanNumber(double number) {
        System.out.print("result : ");
        results.stream().
                filter( result -> result > number).
                forEach(result -> System.out.print(result + ", "));


        System.out.println();

    }


}
