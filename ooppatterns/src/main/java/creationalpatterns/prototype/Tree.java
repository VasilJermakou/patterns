package creationalpatterns.prototype;

public abstract class Tree {

    /* class fields */
    private int age;
    private int height;

    /* constructors */
    public Tree(){
        this.age = 0;
        this.height = 0;
    }

    public Tree(int age, int height){
        this.age = age;
        this.height = height;
    }

    /* getters  and setters */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /* abstract prototype method */
    public abstract Tree copy();

    /* object methods */
    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}
