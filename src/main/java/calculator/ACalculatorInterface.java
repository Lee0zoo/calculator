package calculator;

public interface ACalculatorInterface { // 연산자 구분을 위한 인터페이스 생성
    boolean op(char operator);
    double calc(int num1, int num2);
}
