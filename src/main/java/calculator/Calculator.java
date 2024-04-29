package calculator;

import java.util.*;

public abstract class Calculator {
    // 외부에서 접근 불가능한 컬렉션 필드 선언 & 생성
    ArrayList<Double> fList; // 사칙연산의 결과 저장
    ArrayList<Double> rList; // 원의 넓이 결과 저장

    // 계산 메서드
    abstract double calculate(int num1, int num2, char operator);

    // fList 데이터 삭제 메서드
    public void removeResult() {
        this.fList.remove(0);
    }

    abstract void inquiryList();
}