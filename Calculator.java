import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x;
        double y;
        String operation;
        System.out.println("Enter two numbers:");
        x = scan.nextDouble();
        y = scan.nextDouble();
        operation = scan.nextLine();
        System.out.println("Would you like to add, subtract, multiply, or divide the numbers?");
        operation = scan.nextLine();
        if(operation.equals("add")) {
            System.out.println(x + y);
        } else if(operation.equals("subtract")) {
            System.out.println(x - y);
        } else if(operation.equals("multiply")) {
            System.out.println(x * y);
        } else if(operation.equals("divide")) {
            if(y == 0.0) {
                System.out.println("Error: Divide by zero");
            } else {
                System.out.println(x / y);
            }
        }
    }
    
}
