package zadatak1;

import java.util.Scanner;

public class PerformanceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Performance performance = new Performance(100, 2500);
        performance.meetExpectations();

        Performance performance1 = new Performance();
        System.out.println(performance1.getKPIScore());
        System.out.println(performance1.getBrutoSalary());
        System.out.println(performance1.getCoefficient());

        performance1.meetExpectations();
    }
}
