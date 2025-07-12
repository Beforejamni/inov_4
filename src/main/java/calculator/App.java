package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //FIFO구조이기에 Queue 선언
        Queue<String> results = new LinkedList<>();


        //결과를 문자열로 저장
        String strResult = "";

        while (true) {
            try {
                int firstNum;
                int secondNum;
                char operator;

                //인수는 양의 정수
                while (true) {
                    System.out.print("첫 번째 인수를 입력하세요: ");
                    firstNum = scanner.nextInt();

                    if (firstNum < 0) {
                        System.out.println("인수는 양수의 값(0 포함)을 가집니다.");
                    } else {
                        break;
                    }
                }
                //인수는 양의 정수
                while (true) {
                    System.out.print("두 번째 인수를 입력하세요: ");
                    secondNum = scanner.nextInt();

                    if (secondNum < 0) {
                        System.out.println("인수는 양수의 값(0 포함)을 가집니다.");
                    } else {
                        break;
                    }
                }

                //사칙연산 기호는 +, -, *, /
                while (true) {
                    System.out.print("사칙 연산기호를 입력하세요: ");
                    operator = scanner.next().charAt(0);

                    if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                        break;
                    }
                }

                int result = 0;

                //오버 플로우 방지를 위해 Math 메서드를 사용하였습니다.
                // 인수의 조건에서 양의 정수(0 포함)라고 하여서 빼기와 나누기연산에서는 오버플로우가 발생하지 않는다.
                switch (operator) {
                    case '+':
                        result = Math.addExact(firstNum, secondNum);
                        break;

                    case '-':
                        result = firstNum - secondNum;
                        break;

                    case '*':
                        result = Math.multiplyExact(firstNum, secondNum);
                        break;
                    // / by zero Exception
                    case '/':
                        int div = firstNum / secondNum;
                }
                strResult = result + "";

            } catch (InputMismatchException e) {

                //InputMismatchException 은 e.getMessage() 로 null을 보냄
                System.out.println("InputMismatchException");

                strResult = "InputMismatchException";

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());

                strResult = e.getMessage();
            }


            System.out.println("result = " + strResult);

            results.add(strResult);

            //버퍼에 개행문자가 남아있는 것을 처리
            scanner.nextLine();

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeResult = scanner.next();

            if(removeResult.equals("remove")){
                results.remove();
            }

            //remove로 인해 results가 비었을 경우
            if(!(results.isEmpty())){
                System.out.println("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력시 조회)");
                String inquiryResults = scanner.next();

                if(inquiryResults.equals("inquiry")){
                    for(String result : results){
                        System.out.print(result + ", ");
                    }
                }
            }

            System.out.println("더 계산하시겠습니까?(exit 입력 시 종료)");
            String exit = scanner.next();

            if (exit.equals("exit")) {
                break;

            }


        }
    }
}

