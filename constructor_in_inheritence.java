class A
{
    int x;
   public A()
   {
    System.out.println("Class A " +x);
   }
}
class B extends A
{
        // public B(){
        // System.out.println("Class B");
        // }
}
public class constructor_in_inheritence
{
    public static void main(String[] args)
    {
       B b = new B();
    }
}