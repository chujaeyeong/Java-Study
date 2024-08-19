package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue); //출력:2147483647

        intValue = (int) maxIntOver; //형변환
        // 형변환한 변수에 범위를 초과하는 값이 들어가면 오버플로우가 발생된다.
        // 마치 시계가 한 바퀴 돈 것 처럼 다시 시작해서 -2147483648 가 출력된다
        System.out.println("maxIntOver casting=" + intValue); //출력:-2147483648
    }

}
