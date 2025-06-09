//reverse a number
import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int r=0;
    System.out.println("Enter a number: ");
    int n=s.nextInt();
    while(n>0){
    int d=n%10;
    r=r*10+d;
}
    System.out.println(r);
}
}
      