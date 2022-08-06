package commandPattern.commandPattern2;


public class StringPrintCommand implements Command2 {

    protected String string;

    public StringPrintCommand(String string) {
        this.string = string;
    }

    @Override
    public void execute() {
        System.out.println(this.string);
    }

    @Override
    public int compareTo(Command2 o) {
        StringPrintCommand other =  (StringPrintCommand) o;
        return this.string.length() - other.string.length();
    }
}
