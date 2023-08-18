class Example
{
    public <E> void printArrayElements(E[] a){
        for(E x:a){
            System.out.println(" "+x);
        }
    }
}

public class generic_method{
public static void main(String [] args)
{
    Example e1 = new Example();
    String s[] = new String[] {"India","Pakistan","Nepal"};
    Integer i[] = {12,32,45,56};
    e1.printArrayElements(s);
    e1.printArrayElements(i);
}

}