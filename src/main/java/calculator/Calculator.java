package calculator;

import java.util.*;

public class Calculator {
    // 외부에서 접근 불가능한 컬렉션 필드 선언 & 생성
    private ArrayList<Integer> fList; // 사칙연산의 결과 저장
    private ArrayList<Double> rList; // 원의 넓이 결과 저장
    // 기본 생성자를 통해 ArrayList가 초기화 되도록 설정
    public Calculator() {
        fList = new ArrayList<>();
        rList = new ArrayList<>();
    }

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
        fList.add(result);

        return result;
    }

    // Getter
    public ArrayList<Integer> getFList() {
        return fList;
    }

    // Setter
    public void setFList(ArrayList<Integer> rList) {
        this.fList = rList;
    }

    // rList 데이터 삭제 메서드
    public void removeResult() {
        this.fList.remove(0);
    }

    public void inquiryList() {
        fList.forEach(data -> System.out.print(data + " "));
    }

    // 원의 넓이 계산에 필요한 파이(원주율)는 어떤 경우에라도 변경되면 안 되는 상수이기 때문에 static final로 선언한다.
    static final double pie = 3.14;
    public double calculateCircleArea(int radius) {
        double result = pie * radius * radius;
        rList.add(result);
        return result;
    }

    // Getter
    public ArrayList<Double> getRList() {
        return rList;
    }

    // Setter
    public void setRList(ArrayList<Double> rList) {
        this.rList = rList;
    }

    // 원의 넓이 결과 조회
    public void inquiryRList() {
        rList.forEach(data -> System.out.print(data + " "));
    }
}
