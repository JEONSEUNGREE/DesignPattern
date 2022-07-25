package strategyPattern;

public class Aobj {

    Ainterface ainterface;
    private void funcAA() {

        ainterface.funcA();
        ainterface.funcA(); // 출력 AAA
//       위의 출력은 아래와 같아서 아래 출력을 없애고 위에 객체로 위임하여 대신 사용함
        System.out.println("AAA");
        System.out.println("AAA");

    // 위임(Delegation) ~ 기능이 필요하다. 개발을 부탁
    }
}
