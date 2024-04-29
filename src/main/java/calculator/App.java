package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        // 사용자로부터 입력을 받기 위한 Scanner 선언
        Scanner sc = new Scanner(System.in);
//        // 결과를 저장할 배열
//        int[] rList = new int[10];
//        // 결과 배열의 인덱스
//        int index = 0;

        // ArithmeticCalculator 인스턴스 생성
        ArithmeticCalculator ac = new ArithmeticCalculator();
        CircleCalculator cc = new CircleCalculator();

        // 특정 조건을 만족할 때까지 사용자로부터 계속 입력을 받음
        while(true) {
            // 사칙연산 or 원의 넓이 묻는 내용 출력
            System.out.println("사칙연산을 진행하시겠습니까?(1 입력) 혹은 원의 넓이를 구하시겠습니까?(1이 아닌 숫자 입력) : ");
            int choice = sc.nextInt();
            
            if(choice == 1) {
                // 사용자로부터 입력을 받음
                System.out.print("첫 번째 숫자를 입력하세요 : ");
                int num1  = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요 : ");
                int num2 = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요 : ");
                char operator = sc.next().charAt(0); // charAt()을 통해 char 타입으로 연산 기호 저장


                // 연산 수행 + 결과 result에 저장
                double result = ac.calculate(num1, num2, operator);
                System.out.println("결과 : " + result);


                // 연산 결과 삭제 의사를 묻는 내용 출력
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String rmv = sc.next();

                // 사용자가 remove를 입력했다면, 가장 먼저 입력된 연산 결과를 삭제
                if(rmv.equals("remove")) {
                    ac.removeResult();
                }

                // 저장된 연산 결과 출력 의사를 묻는 내용 출력
                System.out.println("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String ck = sc.next();

                // 사용자가 inquiry를 입력했다면, 연산 결과 전부 조회
                if(ck.equals("inquiry")) {
                    ac.inquiryList();
                    System.out.println();
                }
            } else {
                // 사용자에게 원의 반지름 입력 받음
                System.out.println("원의 반지름을 입력해주세요.");
                int radius = sc.nextInt();

                // 원의 넓이 계산
                double result = cc.calculate(radius, 0, '0');
                System.out.println("결과 : " + result);
                System.out.println("계산된 원의 넓이들");
                cc.inquiryList();
                System.out.println();
            }

            // 추가 연산 여부를 묻는 내용 출력
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String ctu = sc.next();

            // "exit" 입력 시 while 문 종료
            if(ctu.equals("exit")) {
                break;
            }
        }
    }
}
