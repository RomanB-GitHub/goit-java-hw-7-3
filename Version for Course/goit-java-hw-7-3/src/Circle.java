public class Circle extends Shape implements Print {

    @Override
    public final String getName() {
        return "Circle";
    }

    @Override
    public void printShapeName() {
        System.out.println("This shape name will be : " + getName());
    }
}
