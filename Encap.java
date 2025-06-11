import java.util.Scanner;
class Encap{
    static class Student{//Encapusulate student class
        private String name;
        private int age;
        private double grade;
        //constructor names for static class
        public Student(String name, int age,double grade){
            this.name = name;
            this.age = age;
            this.grade = grade;

        }
        public String getName(){//getters
            return name;
        } 
        public int getAge(){
            return age;
        }
        public double getGrade(){
            return grade;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int Age){
            if(age>17){
                this.age = age;
            }else{
                System.out.println("Student is underage for graduation");
            }
        }
        public void setGrade(double grade){
            if(grade>=0 && grade<=100){
                this.grade = grade;
            }else{
                System.out.println("Invalid Grade");
            }
        }
        public void displayDetails(){
            System.out.println("Student Details: ");
            System.out.println("Name:  "+name);
            System.out.println("Age: "+age);
            System.out.println("Grade: "+grade);
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Student name: ");
            String name = sc.nextLine();
            System.out.println("Enter the student age: ");
            int age = sc.nextInt();
            System.out.println("enter the student grade");
            double grade= sc.nextDouble();

            //create aan object for student class
            Student s =new Student(name ,age, grade);
            //initial student dispaly
            s.displayDetails();
            //update by using setter values
            System.out.println("\n updating the values");
            System.out.println("Enter new name: ");
            //clear the buffer before entering the name
            sc.nextLine();
            String newName = sc.nextLine();
            s.setName(newName);
            System.out.println("enter new age: ");
            int newAge = sc.nextInt();
            s.setAge(newAge);
            System.out.println("Enter new grade: ");
            double newGrade = sc.nextDouble();
            s.setGrade(newGrade);
            //call updated student details
            s.displayDetails();
            sc.close();
        }

}