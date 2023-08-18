class MyData <T>{
    T i;
    public void add(T i1)
    {
        i=i1;
    }
    public T get()
    {
        return i;
    }
}
public class generic_class
{
    public static void main(String[] args)
    {
       MyData <Integer> m = new MyData <Integer>();
       MyData <String> m1 = new MyData <String>();
       Integer i = new Integer(5);
       m.add(i);
       m1.add("Rahul");
       System.out.println("m= "+m.get());
       System.out.println("m1= "+m1.get());
    }
}