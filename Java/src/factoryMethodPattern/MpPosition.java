package factoryMethodPattern;

public class MpPosition implements Item{

    @Override
    public void use() {
        System.out.println("체력 회복 물약");
    }
}
