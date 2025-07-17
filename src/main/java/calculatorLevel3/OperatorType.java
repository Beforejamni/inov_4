package calculatorLevel3;

public enum OperatorType {
    ADD('+', new AddOperator()),
    SUB('-', new SubtractOperator()),
    MUL('*', new MultiplyOperator()),
    DIV('/', new DivideOperator()),
    MOD('%', new ModOperator());

    private final char operator;
    private final Operator operate;

    OperatorType(char operator , Operator operate){
        this.operator = operator;
        this.operate = operate;
    }

    public char getOperator() {
        return operator;
    }

    public Operator getOperate() {
        return operate;
    }

}
