package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        // 사용자로부터 입력을 받기 위한 Scanner 선언
        Scanner sc = new Scanner(System.in);
        // 결과를 저장할 배열
        int[] rList = new int[10];
        // 결과 배열의 인덱스
        int index = 0;

        // 특정 조건을 만족할 때까지 사용자로부터 계속 입력을 받음
        while(true) {
            // 사용자로부터 입력을 받음
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1  = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0); // charAt()을 통해 char 타입으로 연산 기호 저장

            int result = 0; // 연산 결과를 담을 변수

            // 사칙연산 기호에 따라 다른 연산을 적용함
            switch (operator) {
                case '+' : result = num1 + num2;
                    break;
                case '-' : result = num1 - num2;
                    break;
                case '*' : result = num1 * num2;
                    break;
                case '/' :
                    if(num2>0) {
                        result = num1 / num2;
                    } else {
                        // num2가 0이면 연산 시 오류가 발생하기 때문에, 잘못된 입력임을 알리는 메세지 출력
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    }
                    break;
                default :
                    // 사칙연산 기호가 아닌 입력이 이루어질 경우 잘못된 입력임을 알리는 메세지 출력
                    System.out.println("욜바른 연산 기호를 입력해 주세요.");
                    break;
            }
            // 결과 출력
            System.out.println("결과 : " + result);

            // 결과를 배열에 입력
            rList[index] = result;
            index++;

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
