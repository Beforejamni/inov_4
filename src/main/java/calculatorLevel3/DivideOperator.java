package calculatorLevel3;

public class DivideOperator implements Operator {

    @Override
    public int operate(int firstNum, int secondNum) throws ArithmeticException{

        int result = firstNum / secondNum;

        if((firstNum & secondNum & result) >= 0){
            return result;
        }else{
            throw new ArithmeticException("integer overflow");
        }
    }
}

//Integer.MIN_VALUE / -1 => 오버플로우 발생
//조건 식은 양의 정수라고 하였지만, 조건 변경시 코드 변경을 하지 않기 위해 넣음