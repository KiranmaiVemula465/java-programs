//progams to raise an exception if a negative number is transformed as 
import java.util.Scanner;
public class Exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        if(num<0){
            throw new ArithmeticException("Negative numbers are not allowed"); 
        }else{
            System.out.println("you have entered: "+num);
        }
    }
}