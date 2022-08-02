package visitorPattern;

public class VisitorA implements Visitor{

    private int ageSum;

    public VisitorA() {
        ageSum = 0;
    }

    public int getAgeSum() {
        return ageSum;
    }

    @Override
    public void visit(Visitable visitable) {
        if (visitable instanceof VisitorableA) {

            ageSum += ((VisitorableA) visitable).getAge();

        } else {

        }



    }
}
