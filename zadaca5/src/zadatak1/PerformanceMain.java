package zadatak1;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.Scanner;

public class PerformanceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Performance performance = new Performance(100, 2500);
        System.out.println("You have met your expectations:" + performance.meetExpectations());

        final Performance performance1 = new Performance(0, 0, 0);

        System.out.println("Please insert the values for Performance calculation for KPI score: ");
        final int KPIScore = scanner.nextInt();
        performance1.setKPIScore(KPIScore);

        System.out.println("Please insert the values for Performance calculation for Bruto Salary: ");
        final double brutoSalary = scanner.nextDouble();
        performance1.setBrutoSalary(brutoSalary);

        System.out.println("Please insert the values for Performance calculation for Coefficient: ");
        final double coefficient = scanner.nextInt();
        performance1.setCoefficient(coefficient);

        System.out.println(performance1.getKPIScore());
        System.out.println(performance1.getBrutoSalary());
        System.out.println(performance1.getCoefficient());

        System.out.println("You will receive the bonus amount off:" + performance1.bonusAmount());
    }
}

