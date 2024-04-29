package calculator;

import java.util.*;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator() {
        // 부모클래스의 fList 가져옴
        super.fList = new ArrayList<>();
    }

    // 사칙연산 수행 클래스 인스턴스 생성
//    AddOperator add = new AddOperator();
//    SubtractOperator sub = new SubtractOperator();
//    MultiplyOperator mul = new MultiplyOperator();
//    DivideOperator div = new DivideOperator();
//    ModOperater mod = new ModOperater();

    // 각각의 클래스로 구현한 사칙 연산 클래스를 받음
    private static final List<ACalculatorInterface> acInterface =
            List.of(new AddOperator(), new SubtractOperator(), new MultiplyOperator(), new DivideOperator(), new ModOperater());

    // Calculator의 계산 메서드 오버라이드
    @Override
    double calculate(int num1, int num2, char operator) {
        // result에 연산 결과를 리턴 받음
        double result = acInterface.stream().filter(acInterface -> acInterface.op(operator))
                .map(acInterface -> acInterface.calc(num1, num2)).findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 연산자를 입력해주세요."));

//        double result = 0;

//        if (operater == '+') {
//            result = add.operate(num1, num2);
//        } else if (operater == '-') {
//            result = sub.operate(num1, num2);
//        } else if (operater == '*') {
//            result = mul.operate(num1, num2);
//        } else if (operater == '/') {
//            result = div.operate(num1, num2);
//        } else if (operater == '%') {
//            result = mod.operate(num1, num2);
//        } else {
//            System.out.println("올바른 연산 기호를 입력해 주세요.");
//        }
        // 결과 저장 리스트에 결과 추가
        fList.add(result);
        return result;
    }

    @Override
    void inquiryList() {
        fList.forEach(data -> System.out.print(data + " "));
    }
}
