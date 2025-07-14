package calculatorLevel2;

import java.util.Queue;

public class Calculator {

    private final static double pie = 3.14159;
    private Queue<String> results;
    private Queue<String> circleResults;

    public Calculator(Queue<String> results ,Queue<String> circleResults) {
        this.results = results;
        this.circleResults = circleResults;
    }


    //사칙 연산 관련 메서드
    // 나누기 연산의 / by zero
    public int calculate(int firstNum , int secondNum ,char operator)throws ArithmeticException{

        switch (operator){

            case '+' :
                return Math.addExact(firstNum, secondNum);

            case '-' :
                return firstNum - secondNum;

            case '*' :
                return Math.multiplyExact(firstNum, secondNum);

            case '/' :
                return firstNum / secondNum;

            default:
                throw new ArithmeticException("계산할 수 없습니다.");
        }

    }

    public void addResults(String result){
        results.add(result);
    }

    public void removeResult() {
        results.remove();
    }

    public void inquiryResults() {
        System.out.print("result = ");

        for(String result : this.results) {
            System.out.print( result + ", ");
        }
        System.out.println();
    }

    public Queue<String> getResults() {
        return results;
    }

    public void setResults(Queue<String> results) {
        this.results = results;
    }

    //원 넓이 관련 메서드

    public double calculateCircleArea(double radius) {
        return radius * radius * pie;
    }

    public void addCircleResult(String result) {
        circleResults.add(result);
    }

    public void removeCircleResult() {
        circleResults.remove();
    }

    public void inquiryCircleResults() {
        System.out.print("results = ");

             for(String result : circleResults) {
                 System.out.print( result + ", ");
             }

        System.out.println();
    }

    public Queue<String> getCircleResults() {
        return circleResults;
    }

    public void setCircleResults(Queue<String> circleResults) {
        this.circleResults = circleResults;
    }
}
