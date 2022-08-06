package chainOfResponsibility2;


// 공격에 해당하는 방어력을 순차적으로 깎아 내는 프로그램이다.

// 하나의 객체에 대해 순차적으로 책임을 진다는 느낌으로 확장해서 사용하면 된다.

// 어떻게 보면 템플릿 메서드 패턴과 비슷하다.
public class Armour implements Defence {

    private Defence nextDefenses;

    private double def;


    public Armour(int i) {
        this.def = i;
    }


    @Override
    public void defence(Attack attack) {
        /**
         *  Point!
         */
        process(attack);
        if (nextDefenses != null) {
            nextDefenses.defence(attack);
        }
    }

    public void process(Attack attack) {
        int amount = attack.getAmount();
        amount -= 10;
        attack.setAmount(amount);
    }

    public void setNextDefenses(Defence nextDefenses) {
        this.nextDefenses = nextDefenses;
    }
}
