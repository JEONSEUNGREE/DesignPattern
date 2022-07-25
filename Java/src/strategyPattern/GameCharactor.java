package strategyPattern;

// 추상적인 접근점을 만들어서 서로 교환 가능하도록 만드는 것
public class GameCharactor {

    //    접근점
    private Weapon weapon;

    //    교환가능
    public void setWeapon(Weapon weapon) {
    //        weapon 인터페이스
        this.weapon = weapon;
    }

    public void attack() {
        // 위임

        if (weapon == null) {
            System.out.println("맨손 공격");
        } else {
            weapon.attack();
        }
    }
}
