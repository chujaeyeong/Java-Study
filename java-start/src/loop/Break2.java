package loop;

public class Break2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        for (; ; ) { // 초기식, 조건식, 증감식을 다 생략한 것, while(true) 랑 동일한 무한루프
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }

}
