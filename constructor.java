import java.util.Scanner;
class Student{
String name;
int marks;
Student(String n, int m){ // constructor creation
name=n;
marks=m;
}
void display(){
System.out.println("Name : "+name);
System.out.println("marks : "+marks);
}
}
public class constructor{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name ");
String name = sc.nextLine();
System.out.println("Enter the marks: ");
int marks = sc.nextInt();
Student s= new Student(name,marks);                       
s.display();
sc.close();
}
}



