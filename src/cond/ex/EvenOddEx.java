package cond.ex;
/**
 * 문제: 홀수 짝수 찾기
 * 정수 `x` 가 주어지면 `x` 가 짝수이면 "짝수"를, `x` 가 홀수이면 "홀수"를 출력하는 프로그램을 작성하자
 * 삼항 연산자를 사용해야 한다.
 * 참고로 `x % 2` 를 사용하면 홀수, 짝수를 쉽게 계산할 수 있다.
 * **출력 예시**
 * ```
 * x: 2
 * 출력: x = 2, 짝수
 * x: 3
 * 출력: x = 3, 홀수
 * */
public class EvenOddEx {

    public static void main(String[] args) {
        int x = 2;
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("출력: x = " + x + ", " + result);
    }
}
