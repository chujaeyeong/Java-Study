package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data = " + data.value); // 윗 라인에서 예외 발생으로 아래는 실행 안 됨
    }
}
