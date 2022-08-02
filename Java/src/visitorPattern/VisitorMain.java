package visitorPattern;

import java.util.ArrayList;

public class VisitorMain {

    public static void main(String[] args) {

        ArrayList<Visitable> visitables = new ArrayList<>();

        visitables.add(new VisitorableA(1));
        visitables.add(new VisitorableA(2));
        visitables.add(new VisitorableA(3));
        visitables.add(new VisitorableA(4));
        visitables.add(new VisitorableA(5));

        VisitorA visitor = new VisitorA();

        for (Visitable visitable : visitables) {
            visitable.accept(visitor);
        }

        System.out.println(visitor.getAgeSum());
    }
}
