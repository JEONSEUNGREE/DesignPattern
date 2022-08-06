package chainOfResposibility;


// 특정 객체가 동작을 실패할 경우 다음 객체가 실행됨
public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Calculator plus =  new PlusCalculator();
        Calculator sub =  new SubPlusCalculator();

        plus.setNextCalculator(sub);
        Request request1 = new Request(1, 2, "+");
        Request request2 = new Request(1, 2, "*");
        plus.process(request1);
        plus.process(request2);

    }
}
