package ComopositePattern;

public class CompositeMain {
    public static void main(String[] args) {
        Folder root = new Folder("root")
                , home = new Folder("home")
                , garam = new Folder("garam")
                , music = new Folder("music")
                , picture = new Folder("picture")
                , doc = new Folder("doc")
                , usr = new Folder("usr")
                ;
        File track1  = new File("track1")
                , track2 = new File("track2")
                , pic1 = new File("pic1")
                , pic2 = new File("pic2")
                , doc1 = new File("do1")
                , java = new File("java")
                ;

        root.addComponent(home);
        home.addComponent(garam);
        music.addComponent(java);
        garam.addComponent(music);
        garam.addComponent(track1);
        garam.addComponent(track2);
        garam.addComponent(pic1);
        garam.addComponent(pic2);
        garam.addComponent(doc);
        doc.addComponent(doc1);

        root.addComponent(usr);
        usr.addComponent(java);

        show(root);

    }

    private static void show(Component component) {
        System.out.println(component.getClass().getName() + " | " + component.getName());
        if (component instanceof Folder) {
            for (Component c : ((Folder)component).getChildren()) {
                show(c);
            }
        }
    }
}

