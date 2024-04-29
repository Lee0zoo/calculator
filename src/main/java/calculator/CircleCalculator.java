package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator {

    public CircleCalculator() {
        // 부모클래스의 rList 가져옴
        super.rList = new ArrayList<>();
    }
    // 원의 넓이 계산에 필요한 파이(원주율)는 어떤 경우에라도 변경되면 안 되는 상수이기 때문에 static final로 선언한다.
    static final double pie = 3.14;

    // Calculator의 계산 메서드 오버라이드
    @Override
    double calculate(int num1, int num2, char operator) {
        double result = pie * num1 * num1;
        rList.add(result);
        return result;
    }

    // 원의 넓이 결과 조회 오버라이드
    public void inquiryList() {
        rList.forEach(data -> System.out.print(data + " "));
    }
}
