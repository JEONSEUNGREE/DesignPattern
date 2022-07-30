package builderPattern;

public class LgGramBluePrint extends BluePrint{

    private Computer computer;

    public LgGramBluePrint() {
        this.computer = new Computer("default", "default", "default");
    }


    @Override
    public void setCpu() {
        computer.setCpu("i5");
    }

    @Override
    public void setRam() {
        computer.setRam("16");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256");
    }

    @Override
    public Computer getComputer() {

        return this.computer;
    }
}
