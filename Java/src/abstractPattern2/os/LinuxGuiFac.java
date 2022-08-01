package abstractPattern2.os;

import abstractPattern2.Button;
import abstractPattern2.GuiFac;
import abstractPattern2.TextArea;

public class LinuxGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
