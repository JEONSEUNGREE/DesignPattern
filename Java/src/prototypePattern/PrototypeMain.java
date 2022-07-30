package prototypePattern;

// 1강
// 복잡한 인스턴스를 복사한다. Cloneable을 통해 복사할수있게 impl하여 명시해준후 복사한다.
// 요구조건 : 복사후 원을 x,y방향으로 1씩이동하라

// 2강
// 깊은 복사, 얕은 복사

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(5,5,6);
        Circle circle2 = circle1.copy();

        System.out.println(circle1.getX() + " , " + circle1.getX() + " , " + circle1.getR() + "객체 주소" + circle1);
        System.out.println(circle2.getX() + " , " + circle2.getX() + " , " + circle2.getR() + "객체 주소" + circle2);

        System.out.println("얕은 복사 =========================================");
        Cat navi = new Cat();
        navi.setName("나비");

        Cat yo = navi;

        yo.setName("요");

        System.out.println(navi.getName() + "객체 주소" + navi);
        System.out.println(yo.getName() + "객체 주소" + yo);

        System.out.println("깊은 복사 =========================================");

        Cat navi1 = new Cat();

        navi1.setName("나비");

        Cat yo1 = navi.copy();

        yo1.setName("요");

        System.out.println(navi1.getName() + "객체 주소" + navi1);
        System.out.println(yo1.getName() + "객체 주소" + yo1);

    }
}
