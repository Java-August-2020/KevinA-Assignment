import java.io.Serializable;

public class Calculator implements Serializable {
    private String operation;
    private double operand1;
    private double operand2;

    boolean operationUsed = false;

    public Calculator() {
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }


    private void setOperation() {
        if (this.operation.equals("+")) {
            System.out.println(this.operand1 + this.getOperand2());

        } else if (this.operation.equals("-")) {
            System.out.println(this.operand1 - this.getOperand2());
        }
    }

    public void getResult() {
        setOperation();
    }
}
