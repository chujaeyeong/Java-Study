package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        // 넓이 구하기
        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        // 둘레 구하기
        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레: " + perimeter);

        // 정사각형인지 확인하기
        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}
