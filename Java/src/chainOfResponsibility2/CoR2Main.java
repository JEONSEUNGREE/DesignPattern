package chainOfResponsibility2;

public class CoR2Main {

    public static void main(String[] args) {
        Attack attack = new Attack(100);

        Armour armour1 = new Armour(10);
        Armour armour2 = new Armour(15);

        armour1.setNextDefenses(armour2);

        armour1.defence(attack);

        System.out.println(attack.getAmount());

        /**
         * Point2
         */

        Defence defence = new Defence() {
            @Override
            public void defence(Attack attack) {
                int amount = attack.getAmount();
                attack.setAmount(amount -= 50);
            }
        };

        armour2.setNextDefenses(defence);

        attack.setAmount(100);

        armour1.defence(attack);

        System.out.println(attack.getAmount());

    }
}
