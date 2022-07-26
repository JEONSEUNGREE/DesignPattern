package templateMethodPattern;
//  알고리즘의 구조를 메소드에 정의 하고
//  하위 클래스에서 알고리즘 구조의
//  변경없이 알고리즘을 재정의 하는 패턴

// 적용 사항
// 구현하려는 알고리즘이 일정한 프로세스가있다, 변경할 가능성이있다.

// 알고리즘을 여러 단계로 나눈다.
//  나눠진 알고리즘의 단계를 메소드 선언한다.
//  알고리즘을 수행할 템플릿 메서드를 만든다.
//  하위 클래스에서 나눠진 메서드를 구현한다.
public class TemplateMethodMain {

    public static void main(String[] args) {
        AbstGameConnectHelper abstGameConnectHelper = new AbstGameConnectHelperImpl();

        abstGameConnectHelper.requestConnection("정보");
    }

}
