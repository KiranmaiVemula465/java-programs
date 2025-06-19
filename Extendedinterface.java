//connection between interface to interface
import java.util.Scanner;
interface BasicOperations{
    void add(int a,int b);
}
interface AdvanceOperation extends BasicOperations{
    void multiply(int a,int b);
}
class Calculator implements AdvanceOperation{
    public void add(int a,int b){
        System.out.println("Addition: "+(a+b));
    }
    public void multiply(int a,int b){
        System.out.println("Multiplication: "+(a*b));
    }
}
public class Extendedinterface{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        Calculator c = new Calculator();// methods ni manam calculator class dwara implement chesthunnam kabatti daniki object create chesi methods call chestham
        c.add(a,b);
        c.multiply(a,b);
        sc.close();

    }
}