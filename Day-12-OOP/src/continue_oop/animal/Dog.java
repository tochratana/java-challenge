package continue_oop.animal;

public class Dog extends Animal {

    private String earShape;
    private String taiShape;


    public Dog(String type, double weight, String taiShape, String earShape) {

        super(type,weight < 15 ? "small" : (weight < 35 ? "Large" : "Mediem"),weight);
        this.taiShape = taiShape;
        this.earShape = earShape;
    }
    public Dog(String type, double weight){
        this(type,weight,"Perky","Curled");
    }

    public Dog() {
        super("Unknow Dog","Small",100); // pass value to the super class

    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", taiShape='" + taiShape + '\'' +
                '}' + super.toString();
    }
}
