package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        // 작은 범위 타입에서 큰 범위 타입으로는 자동 형변환 (묵시적 형변환) 이 된다

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue); //longValue = 10

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue1 = " + doubleValue); //doubleValue1 = 10.0

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue); //doubleValue2 = 20.0
    }

}
