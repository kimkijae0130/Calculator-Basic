import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);

            System.out.println("첫 번째 숫자를 입력하세요");
            double fisrtNumber = input.nextDouble();

            System.out.println("연산자를 입력하세요");
            String middle = input.next();

            System.out.println("두 번째 숫자를 입력하세요");
            double secondNumber = input.nextDouble();
            double i = 0;
            switch (middle){

                case ("+"):
                    i = fisrtNumber + secondNumber;
                    break;

                case ("-"):
                    i = fisrtNumber - secondNumber;
                    break;

                case ("*"):
                    i = fisrtNumber * secondNumber;
                    break;

                case ("/"):
                    i = fisrtNumber / secondNumber;
                    break;
                default:
                    System.out.println("올바르지 않은 연산자입니다");
            }


            System.out.println("계산 결과 : " + i );

    }
}