package calculator;

public class ModOperater implements ACalculatorInterface {
    @Override
    public boolean op(char operator) { // 연산자가 '%'이면 연산 수행
        return ('%' == operator);
    }

    @Override
    public double calc(int num1, int num2) {
        return num1 % num2;
    }

//    public double operate(int num1, int num2) {
//        double result = num1 % num2;
//        return result;
//    }
}
