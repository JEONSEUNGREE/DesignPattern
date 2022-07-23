import java.util.ArrayList;

// 일반화 관계는 상속, 재사용성에 국한 되지않는다.
// 불필요한 속성을 받는경우 연산에 빚이 될 가능성이크다.
// 또한 무결성이 위배 되는데 LIFO에서 위배되는 코드가 작성될수있다. 책 72P
// 어떤 클래스에서 일부 기능만 재사용 하고 싶은경우 위임을 사용해야한다.

// 위배되는 예
//class MyStack<String> extends ArrayList<String>{
//    public void push(String element) {
//        add(element);
//    }
//}

// 변환 과정
// this로 ArrayList를 초기화후 참조하도록 변환
class MyStack<String> extends ArrayList<String>{

    private ArrayList<String> arList = this;
    public void push(String element) {
        add(element);
    }
}

// 최종 변환
// 일반화 관계 제거후 객체 생성 초기화
class MyStackDelegation<String>{

    private ArrayList<String> arList = new ArrayList<String>();

    public void push(String element) {
        arList.add(element);
    }
}


public class Delegation {

}
