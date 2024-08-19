package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; //컴파일 오류 발생
        // double형에서 int형으로 변환 (큰 타입 -> 작은 타입)은 앞에 괄호를 사용해서 변경하고 싶은 데이터타입을 적어줘야 한다.
        // 이걸 명시적 형변환이라고 한다.
        intValue = (int) doubleValue; //형변환
        System.out.println(intValue); //출력:1
    }

}
