package prototypePattern;

public class Cat implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat cat = (Cat) clone();
        return cat;
    }
}
