package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // static 메서드 사용 -> 인스턴스 생성 없이 바로 호출 가능

        System.out.println("before: " + s);
        System.out.println("after: " + deco);

    }
}
