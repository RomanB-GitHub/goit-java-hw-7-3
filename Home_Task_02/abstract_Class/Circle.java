package abstract_Class;

public class Circle extends Shape {
    private String name = "Circle";

    public String getName() {
        return name;
    }

    @Override
   public void printShapeName() {
        System.out.println("This shape name will be : " + getName());
    }
}
