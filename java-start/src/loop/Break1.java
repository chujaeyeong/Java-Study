package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (true) { // while (true) 반복문은 무한반복문
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break; // break를 만나면 반복문을 빠져나옴
            }
            i++;
        }
    }

}
