package calculatorLevel2;

import java.util.Queue;

public abstract class Calculator{

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
//SRP를 지키려는 도중 result를 관리하는 메서드를 생성을 어떻게 처리해야 할지 고민이 많이 필요하다.

//