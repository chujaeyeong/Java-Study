package loop;

public class Break3 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; ; i++) { // 조건식만 빠진 형태, i가 1씩 증가하는 무한루프
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
        }
    }

}
