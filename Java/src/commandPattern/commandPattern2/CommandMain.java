package commandPattern.commandPattern2;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class CommandMain {

    public static void main(String[] args) {

        PriorityQueue<Command2> list = new PriorityQueue<>();

        list.add(new StringPrintCommand("ABC"));
        list.add(new StringPrintCommand("A"));
        list.add(new StringPrintCommand("ABCD"));
        list.add(new StringPrintCommand("ABCDE"));
        list.add(new StringPrintCommand("AB"));
        list.add(new StringPrintCommand("ABCDEF"));

        for (Command2 command2 : list) {
            command2.execute();
        }


    }
}
