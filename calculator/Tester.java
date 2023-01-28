package calculator;

public class Tester {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        float avgOf3Nums = calculator.findAverage(3,4.2f,5);
        float avgOf4Nums = calculator.findAverage(3,4.2f,5,6.5f);
        float avgOf5Nums = calculator.findAverage(3,4.2f,5,6,8.9f);
        System.out.println("avgOf3Numbers= " + avgOf3Nums);
        System.out.println("avgOf4Numbers= " + avgOf4Nums);
        System.out.println("avgOf5Numbers= " + avgOf5Nums);
    }
}
