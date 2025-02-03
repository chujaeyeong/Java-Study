package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수 1
        final int data1;
        data1 = 10; // 최초 한 번만 할당 가능
//        data1 = 20; // 컴파일 오류 -> 값을 못 바꿔서

        // final 지역 변수 2
        final int data2 = 10;
//        data2 = 20; // 컴파일 오류 -> 값을 못 바꿔서

        method(10); // 메서드 호출 시점에 사용한 값이 끝까지 사용
    }

    static void method(final int parameter) {
//        parameter = 20; // 컴파일 오류 -> 호출 시점에 사용한 값이 있기 때문에 내부에서 매개변수 값을 바꾸지 못함
    }
}
