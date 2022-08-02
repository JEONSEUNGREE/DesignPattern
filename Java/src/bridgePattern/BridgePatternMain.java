package bridgePattern;


// 위임을 사용하여 모스부호를 각 출력도구에 맞게 사용할 수 있다.
public class BridgePatternMain {
    public static void main(String[] args) {

        DefaultMCF defaultMCF = new DefaultMCF();
        SoundMCF soundMCF = new SoundMCF();
        FlashMCF flashMCF = new FlashMCF();

        PrintMorseCode printMorseCode = new PrintMorseCode(flashMCF);

//        printMorseCode.g();
//        printMorseCode.a();
//        printMorseCode.r();
//        printMorseCode.a();
//        printMorseCode.m();

        printMorseCode.g().a().r().a().m();
    }
}
