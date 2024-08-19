package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; // continue를 만나면 아래 코드가 실행되지 않고 바로 조건식으로 돌아간다 (i == 3일 경우가 출력되지 않음)
            }
            System.out.println(i);
            i++;
        }
    }

}
