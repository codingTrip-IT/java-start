package array.ex;
/**
 * 문제 - 배열을 사용하도록 변경
 * 다음 문제를 배열을 사용해서 개선하자.
 * */
public class ArrayEx1Ref {
    public static void main(String[] args) {
        int students[] = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }

        double average = (double) total / 5;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}