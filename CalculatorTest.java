class Calculator{

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }
}



public class CalculatorTest {

    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        System.out.println("Result: " + calculator.add(28, 39));

         System.out.println("Result: " + calculator.substract(55, 30));
    }

    // This class is currently empty, but you can add test methods here
    // to test the functionality of your Calculator class.

}