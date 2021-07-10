package creationalpatterns.prototype;

public class Oak extends Tree{

    /* constructors */
    public Oak(){
        super();
    }

    public Oak(int age, int height){
        super(age, height);
    }

    /* overriding abstract method */
    public Tree copy(){
        Tree copyOak = new Oak(this.getAge(), this.getHeight());
        return copyOak;
    }
}
