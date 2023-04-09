package zadatak1;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.Scanner;

public class PerformanceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Performance performance = new Performance(100, 2500);
        System.out.println("You have met your expectations:" + performance.meetExpectations());

        Performance performance1 = new Performance(0, 0, 0);
        System.out.println("Please insert the values for Performance calculation for KPI score: ");
        int KPIScore = scanner.nextInt();
        performance1.setKPIScore(KPIScore);

        System.out.println("Please insert the values for Performance calculation for Bruto Salary: ");
        double brutoSalary = scanner.nextDouble();
        performance1.setBrutoSalary(brutoSalary);

        System.out.println("Please insert the values for Performance calculation for Coefficient: ");
        double coefficient = scanner.nextInt();
        performance1.setCoefficient(coefficient);

        System.out.println(performance1.getKPIScore());
        System.out.println(performance1.getBrutoSalary());
        System.out.println(performance1.getCoefficient());

        System.out.println("You will receive the bonus amount off:" + performance1.bonusAmount());
    }
}

