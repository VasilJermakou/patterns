package structuralpatterns.decorator;

public class ApplicationRunner {
    public static void main(String[] args) {

        ChristmasTree myChristmasTree = new BubbleLights(new TreeTopper(new MyChristmasTree()));
        ChristmasTree officeChristmasTree = new BubbleLights(new BubbleLights(new TreeTopper(new MyChristmasTree())));

        System.out.println(myChristmasTree.decorate());         //decorate with 1 BubbleLights and 1 TreeTopper
        System.out.println(officeChristmasTree.decorate());     //decorate with 2 BubbleLights and 1 TreeTopper
    }
}
