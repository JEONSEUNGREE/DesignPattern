package ObserverPattern2;

import java.util.Observable;
import java.util.Observer;

public class ObsMain2 {

    public static void main(String[] args) {
        Button button = new Button();

        button.addObserver(new Observer() {
            @Override
            public void update(Observable observable, Object o) {
                System.out.println(o + "is Clicked");
            }
        });

        button.onClick();
        button.onClick();
        button.onClick();
    }
}
