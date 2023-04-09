package zadatak3;

public class Complex {
    private int rPart;
    private int iPart;

    public Complex() {
        this(0, 0);
    }

    public Complex(final int rPart, final int iPart) {
        this.rPart = rPart;
        this.iPart = iPart;
    }

    public int Re() {
        return this.rPart;
    }

    public int Im() {
        return this.iPart;
    }

    public Complex add(final Complex z1) {
        return new Complex(this.rPart + z1.Re(), this.iPart + z1.Im());
    }

    public Complex subtract(final Complex z1) {
        return new Complex(this.rPart - z1.Re(), this.iPart - z1.Im());
    }

    public void printComplex() {
        if (this.rPart != 0 && this.iPart != 0) {
            System.out.println(this.rPart + (this.iPart + "i"));
        } else if (this.rPart == 0 && this.iPart != 0) {
            System.out.println((this.iPart + "i"));
        } else if (this.rPart != 0 && this.iPart == 0) {
            System.out.println(this.rPart);
        } else System.out.println(this.rPart + this.iPart);
    }
}


