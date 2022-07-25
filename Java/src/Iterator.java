import java.util.LinkedList;

// 객체지향에서의 재사용에 더해서 일반화와 특수와
// 예를 들어 바나나 키위 딸기 등 을 추상화한다면 과일이라고 생각이 든다.
// 이를 계산식으로 switch문이나 case 문으로 둔다면
// 조건식이 끊임없이 증가하며 하드코딩이 되어버린다.
// 이에 코드를 수정할 필요없이 다형성을 더해서 서브 클래스 캡슐화를 이용해 코드를 작성해본다.
public class Iterator {
//    나쁜예
    /*
    while(장바구니 과일) {
        switch(과일종류)
            case 사과:
                가격총합 = 가격 총합 + 사과 가격
            case 배:
                가격총합 = 가격 총합 + 배 가격
            case 딸기:
                가격총합 = 가격 총합 + 딸기 가격
        }
     */

//    int computeTotalPrice(LinkedList<Fruit> f) {
//        int total = 0;
//        Iterator<Fruit> itr = f.iterator(); // Fruit를 상속하여 사용
//
//        while(itr.hasNext()) {
//            Fruit curFruit = itr.next(); // 다음 과일
//            total = total + curFruit.calculatePrice(); // 가격
//        }
    }
//}
