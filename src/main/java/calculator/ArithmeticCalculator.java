package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator() {
        // 부모클래스의 fList 가져옴
        super.fList = new ArrayList<>();
    }

    // 사칙연산 수행 클래스 인스턴스 생성
    AddOperator add = new AddOperator();
    SubtractOperator sub = new SubtractOperator();
    MultiplyOperator mul = new MultiplyOperator();
    DivideOperator div = new DivideOperator();

    // Calculator의 계산 메서드 오버라이드
    @Override
    double calculate(int num1, int num2, char operater) {
        double result = 0;

        if (operater == '+') {
            result = add.operate(num1, num2);
        } else if (operater == '-') {
            result = sub.operate(num1, num2);
        } else if (operater == '*') {
            result = mul.operate(num1, num2);
        } else if (operater == '/') {
            result = div.operate(num1, num2);
        } else {
            System.out.println("올바른 연산 기호를 입력해 주세요.");
        }
        fList.add(result);
        return result;
    }

    @Override
    void inquiryList() {
        fList.forEach(data -> System.out.print(data + " "));
    }
}
