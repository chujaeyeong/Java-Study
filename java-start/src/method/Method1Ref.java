package method;

public class Method1Ref {

    public static void main(String[] args) {
        int sum1 = add(5, 10); // -> 인수(Argument)를 메서드에 전달함
        System.out.println("결과1 출력:" + sum1);
        int sum2 = add(15, 20);
        System.out.println("결과2 출력:" + sum2);
    }

    // add 메서드
    // 제어자 반환타입 메서드이름 (매개변수 목록 -> 매개변수는 생략 가능)
    public static int add(int a, int b) { // -> 메서드를 정의할 때 매개변수(Parameter)를 선언함
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }

}
