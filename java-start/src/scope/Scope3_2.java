package scope;

public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2; // temp 변수는 if 코드블럭 안에서만 필요한 번수니까 스코프를 if 안으로 한정
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }

}
