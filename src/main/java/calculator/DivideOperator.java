package calculator;

public class DivideOperator implements ACalculatorInterface {
    @Override
    public boolean op(char operator) { // 연산자가 '/'이면 연산 수행
        return ('/' == operator);
    }

    @Override
    public double calc(int num1, int num2) {
        double result = 0;
        try { // try-catch 문을 통해 예외 발생 시 catch 문의 메시지 출력
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

//    public double operate(int num1, int num2) {
//        double result = 0;
//        try {
//            if(num2 == 0) {
//                throw new ArithmeticException("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
//            }else {
//                result = (double) num1 / num2;
//            }
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//        return result;
//    }
}
