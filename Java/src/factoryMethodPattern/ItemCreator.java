package factoryMethodPattern;

public abstract class ItemCreator {

//    템플릿 메서드 처럼 여러 단계가 동작한다.

    public Item create(Item item) {

    //  Step1
        requestItemsInfo(item);
    //  Step2
        item = createItem(item);
    //  Step3
        createItemLog(item);

        return item;
    }

    //    아이템 생성하기 전에 DB에 아이템 정보 요청
    abstract protected void requestItemsInfo(Item item);

    //    아이템 생성후 아이템 복제 등의 불법 방지를 위해 DB에 정보를 남김
    abstract protected void createItemLog(Item item);

    //   아이템을 생성하는 알고리즘
    abstract protected Item createItem(Item item);

}
