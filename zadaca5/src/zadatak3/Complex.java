package zadatak3;

public class Complex {
    private int rPart;
    private int iPart;
    public Complex () {
        this(0,0);
    }
    public Complex (int rPart, int iPart) {
        this.rPart = rPart;
        this.iPart = iPart;
    }
    public int Re(){
        return this.rPart;
    }
    public int Im(){
        return this.iPart;
    }
    public Complex add(Complex z1){
        int z1Re = z1.Re();
        int z1Im = z1.Im();
        Complex sumComplex = new Complex(this.rPart+z1Re, this.iPart+z1Im);
        return sumComplex;
    }
    public Complex subtract(Complex z1){
        int z1Re = z1.Re();
        int z1Im = z1.Im();
        Complex differenceComplex = new Complex(this.rPart-z1Re, this.iPart-z1Im);
        return differenceComplex;
    }
    public void printComplex() {
        boolean realPart = false;
        boolean imPart = false;

        if (this.rPart != 0) realPart = true;
        if (this.iPart != 0) imPart = true;

      if (realPart && !imPart) {
            System.out.println(this.rPart);
        } else if (realPart && !imPart) {
            System.out.println(this.iPart + "i");
        } else if (!realPart && !imPart) {
            System.out.println("0");
        } else System.out.println(this.rPart + this.iPart + "i");
    }
    }


