package builderPattern;


// 복잡한 단계를 거쳐야 생성되는 객체의 구현을 서브 클래스에게 넘겨주는 패턴
// 컴퓨터라는 객체를 생성할때 생성자에 매우 복잡한 객체를 구현해서 넣어야한다면 코드가 복잡해지기 때문에
// 다른 서브클래스에서 대신 수행하여 진행하도록 한다.

// 많은 인자를 가진 객체를 생성시 다른 객체의 도움으로 생성하는 패턴
public class BuilderMain {
    public static void main(String[] args) {

        ComputerFactory computerFactory = new ComputerFactory();

        computerFactory.setBluePrint(new LgGramBluePrint());
//        computerFactory.setBluePrint(new MacAirBluePrint());

        computerFactory.make();
        System.out.println(computerFactory.getComputer());


//        Computer computer = new Computer("i7", "16g", "256g ssd");
//        System.out.println(computer.toString());
    }
}
