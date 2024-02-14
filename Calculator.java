import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Enter two numbers:");
        x = scan.nextInt();
        y = scan.nextInt();
        System.out.println(x + y);
    }
    
}
