package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greatestBetweenFirstAndSecond = first > second ? first : second;    
        System.out.println(greatestBetweenFirstAndSecond < third ? third : greatestBetweenFirstAndSecond);
    }
}
