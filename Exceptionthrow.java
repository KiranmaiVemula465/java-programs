// throw exception

import java.util.Scanner;
public class Exceptionthrow{
    static void checkage(int age){
        if(age<22){
            throw new ArithmeticException("Access Denied-----age proxy is : "+22);
        }else{
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try {
            checkage(age);
            
        } catch (ArithmeticException e) {
            System.out.println("Exception: "+e.getMessage());
        }finally{
            sc.close();
        }
    }

}
//getMessage returns string message
//e.toString()----tring + number
//e.printStackTrace()----