package factoryMethodPattern;

public class FactoryMain {
    public static void main(String[] args) {
//        HpCreator hpCreator = new HpCreator();
//
//        MpCreator mpCreator = new MpCreator();

//        hpCreator.create();
//
//        mpCreator.create();

        HpPotion hpPotion = new HpPotion();
        MpPosition mpPosition = new MpPosition();

        Creator creator = new Creator();

        creator.create(hpPotion);

        creator.create(mpPosition);
    }
}
