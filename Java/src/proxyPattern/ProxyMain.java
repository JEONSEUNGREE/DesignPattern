package proxyPattern;

// 프록시에서 서브 업무 처리
// 주업무는 주 클래스에 위임
public class ProxyMain {

    public static void main(String[] args) {
        Subject real = new RealSubject();

        Subject proxy1 = new Proxy(real);

        Subject proxy2 = new Proxy(real);

        Subject proxy3 = new Proxy(real);

        proxy1.action1();
        proxy1.action2();

        proxy2.action1();
        proxy2.action2();

        proxy3.action1();
        proxy3.action2();
    }
}
