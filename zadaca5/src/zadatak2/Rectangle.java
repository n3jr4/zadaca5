package zadatak2;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }
    public double getCircumference(){
        return (this.a*2 + this.b*2);
    }
    public double getArea(){
        return this.a*this.b;
    }
    public boolean isSquare(){
        return (this.a==this.b);
    }
}
