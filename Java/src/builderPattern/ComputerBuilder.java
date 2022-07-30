package builderPattern;

public class ComputerBuilder {

    private Computer computer;

    /**
     * @Param cpu
     * @Param ram
     * @Param storage
     */
    private ComputerBuilder() {
        this.computer = new Computer("default", "default", "default");
    }

    public static ComputerBuilder start() {
        return new ComputerBuilder();
    }

    public static ComputerBuilder startWithCpu(String string) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerBuilder.setCpu(string);
        return computerBuilder;
    }

    public ComputerBuilder setCpu(String string) {
        this.computer.setCpu(string);
        return this;
    }

    public ComputerBuilder setRam(String string) {
        this.computer.setRam(string);
        return this;
    }

    public ComputerBuilder setStorage(String string) {
        this.computer.setStorage(string);
        return this;
    }

    public Computer build() {
        return this.computer;
    }


}
