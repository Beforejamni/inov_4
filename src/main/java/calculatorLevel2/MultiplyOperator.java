package calculatorLevel2;

public class MultiplyOperator {

    public int operate(int firstNum, int secondNum, char operator) throws ArithmeticException{

        long result =(long) firstNum * (long)secondNum;

        if(result != (int) result){
            throw new ArithmeticException("integer overflow");
        }
        return (int)result;
    }
}

//인수는 long 타입으로 업캐스팅하여 곱한 값이, int 타입으로 다운캐스팅하였을 때와 다르면 overflow 발생
