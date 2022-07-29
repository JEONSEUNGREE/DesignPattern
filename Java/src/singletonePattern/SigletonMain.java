package singletonePattern;

// 하나의 객체를 생성하여 사용함
public class SigletonMain {
    public static void main(String[] args) {

        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();
        SystemSpeaker speaker3 = SystemSpeaker.getInstance();

        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
        speaker1.setVolume(10);

        System.out.println(speaker2.getVolume());

    }
}
