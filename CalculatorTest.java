class Calculator{

    public int add(int a, int b) {
        return a + b;
    }
}



public class CalculatorTest {

    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        System.out.println("Result: " + result);
    }

    // This class is currently empty, but you can add test methods here
    // to test the functionality of your Calculator class.

}