package zadatak2;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(final double a, final double b) {
        this.a = a;
        this.b = b;
    }

    public void setB(final double b) {
        this.b = b;
    }

    public void setA(final double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public double getCircumference() {
        return (this.a * 2 + this.b * 2);
    }

    public double getArea() {
        return this.a * this.b;
    }

    public boolean isSquare() {
        return (this.a == this.b);
    }
}
