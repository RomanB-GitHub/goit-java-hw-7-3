public class Rhomb extends Shape implements Print {


    @Override
    public final String getName() {
        return "Rhomb";
    }

    @Override
    public void printShapeName() {
        System.out.println("This shape name will be : " + getName());
    }
}
