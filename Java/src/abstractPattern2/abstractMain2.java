package abstractPattern2;

import abstractPattern2.os.LinuxGuiFac;

// 라이브러리 소스의 수정없이 개발하기 위함
public class abstractMain2 {

    public static void main(String[] args) {
        GuiFac guiFac = new LinuxGuiFac();

        Button button = guiFac.createButton();
        TextArea textArea  = guiFac.createTextArea();

        button.click();
        textArea.getText();
        System.out.println(System.getProperty("os.name"));
    }
}
