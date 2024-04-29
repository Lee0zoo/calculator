package calculator;

public class DivideOperator {
    public double operate(int num1, int num2) {
        double result = 0;
        try {
            if(num2 == 0) {
                throw new ArithmeticException("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
            }else {
                result = (double) num1 / num2;
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
