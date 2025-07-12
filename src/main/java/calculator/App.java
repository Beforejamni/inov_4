package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true){
            try {
                int firstNum;
                int secondNum;
                int operator;

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
                switch (operator) {
                    case '+':
                        result = Math.addExact(firstNum, secondNum);
                        break;

                    case '-':
                        result = Math.subtractExact(firstNum, secondNum);
                        break;

                    case '*':
                        result = Math.multiplyExact(firstNum, secondNum);
                        break;
                    //버전에 Math.divideExact() 가 없는 버전이라 직접 만들었습니다
                    case '/':
                        int div = firstNum / secondNum;
                        if (0 <= (firstNum & secondNum & div)) {
                            result = firstNum / secondNum;
                        } else {
                            throw new ArithmeticException("integer overflow");
                        }

                }

                System.out.println("result = " + result);


            } catch (InputMismatchException e) {

                System.out.println("InputMismatchException");

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("더 계산하시겠습니까?(exit 입력 시 종료)");
            String exit = scanner.next();

            if(exit.equals("exit")) {
                break;

            }
        }
    }
}
