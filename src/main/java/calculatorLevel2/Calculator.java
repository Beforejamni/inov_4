package calculatorLevel2;

import java.util.Queue;

public abstract class Calculator {

    private Queue<String> results;

    public Calculator(Queue<String> results){
        this.results = results;
    }




    public void addResult(String result){
        results.add(result);
    }


    public void  removeResult(){
        results.remove();
    }

    public void inquiryResults(){
        System.out.print("result = " );
        for(String result : results){
            System.out.print(result + ", ");
        }
        System.out.println();
    }

    public Queue<String> getResults() {
        return results;
    }
}
