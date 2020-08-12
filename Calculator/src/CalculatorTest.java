public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation("-");
        calculator.setOperand1(10.5);
        calculator.setOperand2(5.2);
        calculator.getResult();
    }


}
