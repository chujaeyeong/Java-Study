package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;
        // do 안에 있는 코드 블럭은 무조건 실행하고,
        // 그 다음 조건식으로 체크한다
        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
    }

}
