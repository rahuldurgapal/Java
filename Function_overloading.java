class A{
   public void f1(int x){
     System.out.println("Class A " +x);
   }
}
class B extends A{             //Function Overloading
    public void f1(int x, int y){
        System.out.println("Class B " +(x+y));
    }
}
public class Function_overloading{
    public static void main(String[] args){
         B obj = new B();
         obj.f1(4);
         obj.f1(5,6);
    }
}