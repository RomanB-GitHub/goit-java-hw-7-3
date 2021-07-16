public class Quad extends Shape implements Print {

    @Override
    public final String getName() {
        return "Quad";
    }

    @Override
    public void printShapeName() {
        System.out.println("This shape name will be : " + getName());
    }
}
