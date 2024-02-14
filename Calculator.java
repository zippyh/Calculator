import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        String operation;
        System.out.println("Enter two numbers:");
        x = scan.nextInt();
        y = scan.nextInt();
        System.out.println("Would you like to add, subtract, multiply, or divide the numbers?");
        operation = scan.nextLine();
        if(operation == "add") {
            System.out.println(x + y);
        } else if(operation == "subtract") {
            System.out.println(x - y);
        } else if(operation == "multiply") {
            System.out.println(x * y);
        } else if(operation == "divide") {
            System.out.println(x / y);
        }
    }
    
}
