public class Oval extends Shape implements Print {

    @Override
    public final String getName() {
        return "Oval";
    }

    @Override
    public void printShapeName() {
        System.out.println("This shape name will be : " + getName());

    }
}
