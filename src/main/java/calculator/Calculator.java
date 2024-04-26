package calculator;

import java.util.*;

public class Calculator {
    // 외부에서 접근 불가능한 컬렉션 필드 선언 & 생성
    private ArrayList<Integer> rList = new ArrayList<>();

    public int calculate(int num1, int num2, char operater) {
        int result = 0;

        if (operater == '+') {
            result = num1 + num2;
        } else if (operater == '-') {
            result = num1 - num2;
        } else if (operater == '*') {
            result = num1 * num2;
        } else if (operater == '/') {
            try {
                result = num1 / num2;
            } catch (ArithmeticException e) {
                System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
            }
        } else {
            System.out.println("올바른 연산 기호를 입력해 주세요.");
        }

        // 결과를 리스트에 저장
        rList.add(result);

        return result;
    }

    // Getter
    public ArrayList<Integer> getRList() {
        return rList;
    }

    // Setter
    public void setRList(ArrayList<Integer> rList) {
        this.rList = rList;
    }

    // rList 데이터 삭제 메서드
    public void removeResult() {
        this.rList.remove(0);
    }

    public void inquiryList() {
        rList.forEach(data -> System.out.print(data + " "));
    }
}
