package zadatak1;

import java.util.Scanner;

public class Performance {
    private int KPIScore;
    private double coefficient;
    private double brutoSalary;

    public Performance () {
        this.enterValues();
    }
    public Performance (int KPIScore, double brutoSalary) {
        this(KPIScore,brutoSalary,0.5);
    }
    public Performance (int KPIScore, double brutoSalary, double coefficient) {
        this.KPIScore = KPIScore;
        this.brutoSalary =brutoSalary;
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

    public double bonusAmount(){
        if (this.KPIScore >= 50){
        return this.coefficient*this.KPIScore*this.brutoSalary/100;}
        else return 0;
    }

    public void meetExpectations(){
        if (this.KPIScore==100){
            System.out.println("Congratulations, you have met the expectations, you will be rewarded with bounus amount of: " + this.bonusAmount());
        }else if (this.KPIScore>100) {
            System.out.println("Congratulations, you have exceeded the expectations, you will be rewarded with bounus amount of: " + this.bonusAmount());
        } else if (this.KPIScore<100 && this.KPIScore>50) {
            System.out.println("Unfortunately, you didn't met the expectations, but you haven't either underperformed. You will receive a bonus in amount of: " + this.bonusAmount()/2);
        }else if (this.KPIScore<=50) {
            System.out.println("Unfortunately, you have underperformed.");
        }
    }

    public void enterValues(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the values for Performance calculation in the following order: KPI score, Bruto Salary, Coefficient:\n");
        this.KPIScore = scanner.nextInt();
        this.brutoSalary = scanner.nextDouble();
        this.coefficient = scanner.nextDouble();
    }
}
