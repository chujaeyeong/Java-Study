package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }

        // temp 변수의 스코프가 너무 길어서 불필요한 메모리가 사용됨
        System.out.println("m = " + m);
    }

}
