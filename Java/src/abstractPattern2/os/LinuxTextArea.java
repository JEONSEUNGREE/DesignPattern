package abstractPattern2.os;

import abstractPattern2.TextArea;

public class LinuxTextArea implements TextArea {
    @Override
    public void getText() {
        System.out.println("리눅스 텍스트");
    }
}
