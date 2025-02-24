package poly.diamond;

public class Child implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon() {
        // methodCommon() 의 경우 양쪽 인터페이스에 다 있지만 같은 메서드이므로 구현은 하나만 하면 된다.
        System.out.println("Child.methodCommon");
    }
}
