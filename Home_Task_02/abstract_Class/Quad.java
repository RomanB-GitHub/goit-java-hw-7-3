package abstract_Class;

public class Quad extends Shape {
    private String name = "Quad";

    public String getName() {
        return name;
    }

    @Override
    public void printShapeName() {

        System.out.println("This shape name will be : " + getName());
    }
}
