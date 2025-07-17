package calculatorLevel3;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       ArithmeticCalculator operateResults = new ArithmeticCalculator(new LinkedList<>());
       CircleCalculator circleResults = new CircleCalculator(new LinkedList<>());

        //결과를 문자열로 저장
        String strResult = "";

        while (true) {
            System.out.print("계산하고 싶은 종류를 선택하세요( circle or  operate ) : ");
            String kindResults = scanner.next();

            try {
                if(kindResults.equals("operate")) {
                    Number firstNum;
                    Number secondNum;
                    char operator;


                    // 다양한 타입을 받아 올 수 있는 방법?
                    // double? int?
                        System.out.print("첫 번째 인수를 입력하세요: ");

                        firstNum = scanner.nextDouble();



                        System.out.print("두 번째 인수를 입력하세요: ");
                        secondNum = scanner.nextDouble();





                    //사칙연산 기호는 +, -, *, /

                    System.out.print("사칙 연산기호를 입력하세요: ");
                    operator = scanner.next().charAt(0);



                    Number result = 0;
                    result = operateResults.calculate(firstNum, secondNum, operator);
                    strResult = result + "";
                } else if (kindResults.equals("circle")) {
                        double radius = 0;
                    while(true) {
                        System.out.print("반지름을 입력해주세요 : ");
                        radius = scanner.nextDouble();

                        if(radius < 0){
                            System.out.println("반지름은 0이상입니다.");
                            continue;
                        }else{
                            break;
                        }
                    }

                    double result = circleResults.calculate(radius);
                    strResult = result + "";

                } else{
                    System.out.println("circle 과 operate 중에 하나를 골라주세요");
                    continue;
                }


            } catch (InputMismatchException e) {

                //InputMismatchException 은 e.getMessage() 로 null을 보냄
                System.out.println("InputMismatchException");

                strResult = "InputMismatchException";

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());

                strResult = e.getMessage();
            }



            System.out.println("result = " + strResult);

            if(kindResults.equals("operate")) {
                operateResults.addResult(strResult);
            }else if (kindResults.equals("circle")) {
                circleResults.addResult(strResult);

            }

            //버퍼에 개행문자가 남아있는 것을 처리
            scanner.nextLine();

            System.out.println("어떤 저장값들을 관리하겠습니까?");
            System.out.print("circle or operate (다른 값 입력 시 스킵) : ");
            String management = scanner.next();


            //저장 값을 한 번에 담으려고 시도하였으나 잘 되지 않았습니다..
            switch (management) {

                case "operate" :
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                 String removeResult = scanner.next();

                if (removeResult.equals("remove")) {
                    operateResults.removeResult();
                }

                //remove로 인해 results가 비었을 경우
                if (!(operateResults.getResults().isEmpty())) {
                    System.out.println("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력시 조회)");
                    String inquiryResults = scanner.next();

                    if (inquiryResults.equals("inquiry")) {
                        operateResults.inquiryResults();
                    }
                }
                break;

                case "circle" :
                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                     removeResult = scanner.next();

                    if (removeResult.equals("remove")) {
                        circleResults.removeResult();
                    }

                    //remove로 인해 results가 비었을 경우
                    if (!(circleResults.getResults().isEmpty())) {
                        System.out.println("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력시 조회)");
                        String inquiryResults = scanner.next();

                        if (inquiryResults.equals("inquiry")) {
                            circleResults.inquiryResults();
                        }
                    }
                    break;

                default:
                    break;

            }
            operateResults.inquiryResults();
            circleResults.inquiryResults();

            System.out.println("더 계산하시겠습니까?(exit 입력 시 종료)");
            String exit = scanner.next();

            if (exit.equals("exit")) {
                break;

            }


        }
    }
}

// 처음부터 바로 관리(결과 제거, 조회)로 이어지는 코드 작성을 해보고 싶었습니다.
//abstract class 생성 시, 공통된 메서드를 abstract에 구체화하는 것이 맞는지
// override를 통해 재정의해서 쓰는 것이 맞는지에 대한 고민이 많이 생깁니다.
