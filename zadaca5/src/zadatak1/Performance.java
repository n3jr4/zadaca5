package zadatak1;

import java.util.Scanner;

public class Performance {
    private int KPIScore;
    private double coefficient;
    private double brutoSalary;

    public Performance(final int KPIScore, final double brutoSalary) {
        this(KPIScore, brutoSalary, 0.5);
    }

    public Performance(final int KPIScore, final double brutoSalary, final double coefficient) {
        this.KPIScore = KPIScore;
        this.brutoSalary = brutoSalary;
        this.coefficient = coefficient;
    }

    public double getBrutoSalary() {
        return brutoSalary;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public int getKPIScore() {
        return KPIScore;
    }

    public void setBrutoSalary(double brutoSalary) {
        this.brutoSalary = brutoSalary;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public void setKPIScore(int KPIScore) {
        this.KPIScore = KPIScore;
    }

    public double bonusAmount() {
        if (this.KPIScore >= 50) {
            return this.coefficient * this.KPIScore * this.brutoSalary / 100;
        } else return 0;
    }

    public boolean meetExpectations() {
        return this.KPIScore >= 100;
    }
}
