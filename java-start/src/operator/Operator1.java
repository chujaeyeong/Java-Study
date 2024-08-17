package operator;

public class Operator1 {

    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("sum = " + sum); // sum = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("diff = " + diff); // diff = 3

        // 곱셈
        int multi = a * b;
        System.out.println("multi = " + multi); // multi = 10

        // 나눗셈
        int div = a / b;
        System.out.println("div = " + div); // div = 2, int형이라 소숫점 짤림

        // 나머지
        int mod = a % b;
        System.out.println("mod = " + mod); // mod = 1

//        int z = 10 / 0; // 0으로 나눌 수 없음, 수학에서 허용하지 않기 때문에 프로그램에서도 허용 X (ArithmeticException 발생)
    }

}
