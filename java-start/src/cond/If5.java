package cond;

public class If5 {

    public static void main(String[] args) {
        int price = 10000;// 아이템 가격
        int age = 10;//나이
        int discount = 0;

        // 가격 기준 할인과 나이 기준 할인을 중복 적용할 경우
        // 독립 조건이라 if문을 각각 써줘야 한다.

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }
        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }
        System.out.println("총 할인 금액: " + discount + "원");
    }

}
