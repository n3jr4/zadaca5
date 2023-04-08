package zadatak2;

public class RectangleMain {
    public static void main(String[] args) {
        final Rectangle rectangleA = new Rectangle(7, 8.5);

        System.out.println(rectangleA.getArea());
        System.out.println(rectangleA.getCircumference());

        rectangleA.setB(7);
        System.out.println(rectangleA.isSquare());
    }
}
