public class Calculator {
    public void add (int operand1, int operand2)  {
        System.out.println(operand1 + operand2);
    }

    public void sub (int operand1, int operand2)  {
        System.out.println(operand1 - operand2);
    }

    public void mul (int operand1, int operand2)  {
        System.out.println(operand1 * operand2);
    }

    public void div (int operand1, int operand2) {
        try {
            System.out.println( (double) operand1 / operand2);
            throw new ArithmeticException("Division by 0 is not possible");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
