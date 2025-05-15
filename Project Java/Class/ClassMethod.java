package Class;

public class ClassMethod {
    static void Method1(){
        int x=5;
        int y=10;
        System.out.println(x+y);
    }
    public void Method2(){
        int a=9;
        int b=20;
        System.out.println(a*b);
    }
    public static void main(String[]args){
        Method1();
        ClassMethod myObb = new ClassMethod();
        myObb.Method2();
    }
}
