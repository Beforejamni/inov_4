package calculatorLevel2;

public class AddOperator {

    public int operate(int firstNum , int secondNum, char operator) throws ArithmeticException{

        int result = firstNum + secondNum;

        if(((firstNum ^ result) & (secondNum ^ result)) < 0){
            throw new ArithmeticException("integer overflow");
        }else{
            return result;
        }
    }
}

//^ 는 xor연산이다. 비트 중 하나만 0일 경우 1로 환산한다.
// 더했을 경우 result가 음수면 오버플로우가 발생한 것이기 때문에,
//((firstNum ^ result) & (secondNum ^ result)) < 0 으로 판별할 수 있다.

//Math.addExact() 참고.
