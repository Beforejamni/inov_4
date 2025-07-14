package calculatorLevel2;

public class SubtractOperator implements Operator {

    @Override
    public int operate(int firstNum, int secondNum) throws ArithmeticException{
        int result = firstNum - secondNum;

        if(((firstNum ^ secondNum) & (firstNum ^ result)) < 0){
            throw new ArithmeticException("integer overflow");
        }else{
            return result;
        }
    }
}

//App 조건이 0을 포함한 양의 정수라고 하였지만, 조건이 바꼈을 경우를 대비해 코드를 작성하였다.

//firstNum - secondNum => firstNum + (-secondNum)
// firstNum < 0 , secondNum < 0, result > 0 == overflow
