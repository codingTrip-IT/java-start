package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");
        while (true) {
            System.out.print("정수를 입력하세요 (0을 입력하면 종료): ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }
            
            sum += number;
        }

        System.out.println("입력한 모든 정수의 합: " + sum);
    }
}
