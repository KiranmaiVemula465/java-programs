//here multiple interface cannot be created
import java.util.Scanner;
interface Hi{
    void sayHello(String name);
}
public class Functionalinterface{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        Hi greeting = (n)->System.out.println("Hello,"+n+" Good morning");//n=name of functiona interface
        greeting.sayHello(name);
        sc.close();
    }
} 