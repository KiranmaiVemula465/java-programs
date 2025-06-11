class Mathoperations{
    //overload method
    int add (int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;

    }
}
public class Compiletime_methodoverloading{
    public static void main(String[] args) {
        Mathoperations mo = new Mathoperations();
        System.out.println("Addition: "+mo.add(2,4));
        System.out.println("Addition: "+mo.add(2,4));
        System.out.println("Addition: "+mo.add(2,4,6));
    }
}