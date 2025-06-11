import java.util.Scanner;

class Student{
    String name;
    int roll;
    String grade;
    //Constructor no args
    Student(){
        name="unknown";
        roll=0;
        grade="Not given";
    }
    //Constructor 1 args
    Student(String name){
        this.name=name;
        roll=0;
        grade="Not given";
    }
    //Constructor 2 args
    Student(String name,int roll){
        this.name=name;
        this.roll=roll;
        grade="Not given";
    }
    //Constructor 2 args
    Student (int roll,String grade){
        this.roll=roll;
        this.grade=grade;
        name="unknown";
    }
    //Constructor 3 args
    Student(String name,int roll,String grade ){
        this.name=name;
        this.roll=roll;
        this.grade=grade;
    }
    public void display(){
        System.out.println("Name : "+name+"\nRoll NO : "+roll+"\nGrade : "+grade);
    }

}

public class Conoverload {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("--Enter student 1 details--");
        System.out.print("Enter name : ");
        String name=sc.nextLine();
        System.out.print("Enter roll no : ");
        int roll=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter grade : ");
        String grade=sc.nextLine();
        

        System.out.println();
        System.out.println("--Enter student2 details--");
        System.out.print("Enter name : ");
        String name2=sc.nextLine();
        System.out.print("Enter roll no : ");
        int roll2=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter grade : ");
        String grade2=sc.nextLine();


        Student s1=new Student(name,roll);
        System.out.println("-----Student 1 Details-----");
        s1.display();
        System.out.println("-----Student 2 Details-----");
        Student s2=new Student(name2,roll2,grade2);
        s2.display();
        System.out.println("----Student 3 Details----");
        Student s3=new Student();
        s3.display();
    }
}