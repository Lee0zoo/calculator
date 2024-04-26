package calculator;

import java.util.*;

public class Calculator {
    ArrayList<Integer> rList = new ArrayList<>();
    int result;

    public int calculate(int num1, int num2, char operater) {
        try {
            switch (operater) {
                case '+' : result = num1 + num2;
                    break;
                case '-' : result = num1 - num2;
                    break;
                case '*' : result = num1 * num2;
                    break;
                case '/' :
                    try {
                        result = num1 / num2;
                    } catch (ArithmeticException e) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    }
                    break;
            }
        } catch (Exception e) {
            System.out.println("욜바른 연산 기호를 입력해 주세요.");
        }
        return result;
    }
}
