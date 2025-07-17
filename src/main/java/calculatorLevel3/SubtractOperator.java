package calculatorLevel3;

public class SubtractOperator implements Operator {

    @Override
    public <T extends Number> double operate( T firstNum ,T secondNum){

        if( firstNum instanceof Double || secondNum instanceof  Double) {
            return  (firstNum.doubleValue() - secondNum.doubleValue());
        }else if(firstNum instanceof Float || secondNum instanceof Float) {
            return  (firstNum.floatValue() - secondNum.floatValue());
        }else if(firstNum instanceof Long || secondNum instanceof Long) {
            return  (firstNum.longValue() - secondNum.longValue());
        }else if(firstNum instanceof Integer || secondNum instanceof Integer) {
            return  (firstNum.intValue() - secondNum.intValue());
        }else{
            throw new IllegalArgumentException("Not Calculate");
        }
    }
}

