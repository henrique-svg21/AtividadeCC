public class Calculator {
    // Private Attributes
    private double num1;
    private double num2;
    // Constructor
    public Calculator(double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
    }
    // Getter and Setter Methods
    public double getNum1() { 
        return num1; 
    }
    public void setNum1(double num1) { 
        this.num1 = num1; 
    }

    public double getNum2() { 
        return num2; 
    }
    public void setNum2(double num2) { 
        this.num2 = num2; 
    }

    // Operations 
    public double sum() {
        return this.num1 + this.num2;
    }

    public double div() {
        if (num2 == 0) {
            System.out.println("It is not possible to divide by zero!");
            return 0;
        }
        else {
            return this.num1 / this.num2;
        }
    }

    public double subtract() {
        return this.num1 - this.num2;
    }

    public double multiply() {
        return this.num1 * this.num2;
    }
}

