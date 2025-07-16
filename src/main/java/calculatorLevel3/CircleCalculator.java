package calculatorLevel3;

import java.util.Queue;

public class CircleCalculator extends Calculator {

    private final static double pie = 3.14159;
    private Queue<String> results;


    public CircleCalculator(Queue<String> results){
        this.results = results;
    }

    public double calculate(double radius) {
        return radius * radius * pie;
    }


    @Override
    public void addResult(String result) {
        results.add(result);

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
