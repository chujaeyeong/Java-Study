package poly.ex3;

// 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.
public abstract class AbstractAnimal {
    public abstract void sound(); // 자식 클래스가 반드시 오버라이딩해야 컴파일 오류가 발생하지 않음

    // 추상메서드가 아니라서 자식이 오버라이딩 하지 않아도 된다
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
