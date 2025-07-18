package calculatorLevel3;

import java.util.Queue;

public class CircleCalculator extends Calculator {

    private final static double pie = 3.14159;
    private Queue<Double> results;


    public CircleCalculator(Queue<Double> results){
        this.results = results;
    }

    public double calculate(double radius) {
        return radius * radius * pie;
    }


    @Override
    public void addResult(double result) {
        results.add(result);

    }

    @Override
    public void removeResult() {
        results.remove();

    }

    @Override
    public void inquiryResults() {
        System.out.print("results : ");
        for (double result : results) {
            System.out.println(result + ", ");
        }
        System.out.println();
    }

    @Override
    public void inquiryResultsOverScanNumber(double number) {

    }

    public Queue<Double> getResults() {
        return results;
    }
}
