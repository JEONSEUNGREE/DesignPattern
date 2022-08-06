package chainOfResponsibility2;

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
