public class Triangle extends Shape implements Print {

    @Override
    public final String getName() {
        return "Triangle";
    }

    @Override
    public void printShapeName() {
        System.out.println("This shape name will be : " + getName());
    }
}
