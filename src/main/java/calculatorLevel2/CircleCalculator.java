package calculatorLevel2;

import java.util.LinkedList;
import java.util.Queue;

public class CircleCalculator extends Calculator {

    private final static double pie = 3.14159;

    public CircleCalculator(Queue<String> results){
        super(results);
    }

    public double calculateCircleArea(double radius) {
        return radius * radius * pie;
    }

}
