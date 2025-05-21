package method.ex;
/**
 * 문제 - 반복 출력 리펙토링
 * 다음은 특정 숫자만큼 같은 메시지를 반복 출력하는 기능이다.
 * 메서드를 사용해서 리펙토링해보자.
 * */
public class MethodEx2Ref {
    public static void main(String[] args) {
        printMessage("Hello, world!",3);
        printMessage("Hello, world!",5);
        printMessage("Hello, world!",7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
