package factoryMethodPattern;


// 템플릿 메서드패턴과 같이 사용하듯이 분리하여 사용한다.
// 필요한 알고리즘을 단계별로 나누어 구조와 구현부를 분리해서 사용한다.
// 단 외부에서는 create 함수에만 접근하여 사용만 하게하고
// 나머지 메서드에는 접근이 불가하게한다.

// 장점 메인클래스에서 특별한 변경없이 수정하고자 하는 알고리즘이 구현된 코드만 수정하여 사용할 수 있다.
public class Creator extends ItemCreator{

    @Override
    protected void requestItemsInfo(Item item) {
        item.use();
    }

    @Override
    protected void createItemLog(Item item) {
        System.out.println("아이템 생성");
    }

    @Override
    protected Item createItem(Item item) {
        return item;
    }
}
