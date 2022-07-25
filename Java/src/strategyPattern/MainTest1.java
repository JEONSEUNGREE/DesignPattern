package strategyPattern;

public class MainTest1 {
    public static void main(String[] args) {
//        AinterfaceImpl ainterface = new AinterfaceImpl();
//        ainterface.funcA();

//         하나의 인터페이스를 갖고 여러 클래스가 구현함으로 다형성으로
//         게임 캐릭터에 수정없이 무기를 추가할수있음

        GameCharactor gameCharactor = new GameCharactor();

        gameCharactor.attack();

        gameCharactor.setWeapon(new Knife());

        gameCharactor.attack();

        gameCharactor.setWeapon(new Sword());

        gameCharactor.attack();

        gameCharactor.setWeapon(new Ax());

        gameCharactor.attack();
    }
}
