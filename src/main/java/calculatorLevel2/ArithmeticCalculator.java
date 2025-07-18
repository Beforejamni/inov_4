package calculatorLevel2;



import java.util.Queue;

public class ArithmeticCalculator extends Calculator {


    private final Queue<String> results;

    public ArithmeticCalculator(Queue<String> results){
        this.results = results;
    }


    public int calculate(int firstNum , int secondNum, char operator )throws ArithmeticException {

        switch (operator) {

            case '+':
                return new AddOperator().operate(firstNum, secondNum);

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
