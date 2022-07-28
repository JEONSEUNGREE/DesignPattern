package factoryMethodPattern;

public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("마력회복");
    }

}
