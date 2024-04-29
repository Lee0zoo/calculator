package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator() {
        // 부모클래스의 fList 가져옴
        super.fList = new ArrayList<>();
    }

    // Calculator의 계산 메서드 오버라이드
    @Override
    double calculate(int num1, int num2, char operater) {
        double result = 0;

        if (operater == '+') {
            result = num1 + num2;
        } else if (operater == '-') {
            result = num1 - num2;
        } else if (operater == '*') {
            result = num1 * num2;
        } else if (operater == '/') {
            try {
                if(num2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                }else {
                    result = num1 / num2;
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("올바른 연산 기호를 입력해 주세요.");
        }
        return result;
    }
}
