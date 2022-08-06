package ObserverPattern;

public class ObsMain {

    public static void main(String[] args) {


        Button button = new Button();

        button.setClickListener(new ButtonClick());
        button.onClick();
    }
}

class ButtonClick implements Button.OnClickListener {


    @Override
    public void onClick(Button button) {

        System.out.println(button + "is Clicked");

    }
}
