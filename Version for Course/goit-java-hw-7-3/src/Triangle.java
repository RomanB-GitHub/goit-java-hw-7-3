public class Triangle extends Shape{
    private String name = "Triangle";

    public String getName() {
        return name;
    }

    @Override
    public void printShapeName() {
        System.out.println("This shape name will be : " + getName());
    }
}
