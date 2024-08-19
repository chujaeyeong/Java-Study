package casting;

public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1); // 1, int이므로 int타입으로 결과가 나온다.

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); // 1.0(double)로 형변환 되었다.

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); // 1.5, double / int이므로, double / double로 형변환이 발생한

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); //1.5, double / double -> double이 된다.

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); //1.5
    }

}
