package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




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

                if(operator == '+' || operator == '-' || operator == '*' || operator =='/'){
                    break;
                }
            }


            System.out.println("firstNum = " + firstNum);
            System.out.println("secondNum = " + secondNum);
            System.out.println("operator = " + operator);
        }catch(InputMismatchException e){

            System.out.println("InputMismatchException");
        }

    }
}
