import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        System.out.println("Choose you arithmetic operation");
        System.out.println("Enter '+' to add, '-' to sub, '*' to mul, '/' to div");
        String sign = in.next();
        System.out.println("Enter you number 1, number 2");
        int operand1 = in.nextInt(), operand2 = in.nextInt();
        switch (sign) {
            case "+":
                calculator.add(operand1, operand2);
                break;
            case "-":
                calculator.sub(operand1, operand2);
                break;
            case "*":
                calculator.mul(operand1, operand2);
                break;
            case "/":
                calculator.div(operand1, operand2);
                break;
            default:
                throw new Exception("Error. Unknown arithmetic sign");

        }
    }
}
