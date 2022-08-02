package bridgePattern;

public class SoundMCF implements MorseCodeFunction{

    @Override
    public void dot() {
        System.out.print("삣");
    }

    @Override
    public void dash() {
        System.out.print("삐이");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }

}
