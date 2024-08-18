package cond;

public class If4 {

    public static void main(String[] args) {
        int age = 14;

        // if - else if - else 연관조건일 때
        if (age <= 7) { // ~7 미취학
            System.out.println("미취학");
        } else if (age >= 8 && age <= 13) { // 8 ~ 13 초등학생
            System.out.println("초등학생");
        } else if (age >= 14 && age <= 16) { //14~16: 중학생
            System.out.println("중학생");
        } else if (age >= 17 && age <= 19) { //17~19: 고등학생
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

    }

}
