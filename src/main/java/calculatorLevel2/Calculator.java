package calculatorLevel2;

import java.util.Queue;

public class Calculator {

    private Queue<String> results;


    public Calculator(Queue<String> results) {
        this.results = results;
    }


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
}
