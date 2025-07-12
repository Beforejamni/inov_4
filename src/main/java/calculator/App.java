package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //인수는 양의 정수

        try {
            int firstNum = 0;
            int secondNum = 0;
            while (true) {
                System.out.print("첫 번째 인수를 입력하세요: ");
                 firstNum = scanner.nextInt();

                if (firstNum < 0) {
                    System.out.println("인수는 양수의 값(0 포함)을 가집니다.");
                } else {
                    break;
                }
            }

                while (true) {
                    System.out.print("두 번째 인수를 입력하세요: ");
                    secondNum = scanner.nextInt();

                    if (secondNum < 0) {
                        System.out.println("인수는 양수의 값(0 포함)을 가집니다.");
                    } else {
                        break;
                    }
                }


                System.out.println("firstNum = " + firstNum);
                System.out.println("secondNum = " + secondNum);
        }catch(InputMismatchException e){

            System.out.println("InputMismatchException");
        }

    }
}
