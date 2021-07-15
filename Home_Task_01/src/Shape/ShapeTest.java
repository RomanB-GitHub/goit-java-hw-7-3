package Shape;

public class ShapeTest {
    public static void main (String[] args){
        Shape quad  = new Quad();
        System.out.println("Here is your figure name - " + quad.getName());

        Shape triangle  = new Triangle();
        System.out.println("Here is your figure name - " + triangle.getName());

        Shape hexagon  = new Hexagon();
        System.out.println("Here is your figure name - " + hexagon.getName());

        Shape rhomb  = new Rhomb();
        System.out.println("Here is your figure name - " + rhomb.getName());

        Shape circle  = new Circle();
        System.out.println("Here is your figure name - " + circle.getName());

    }

}
