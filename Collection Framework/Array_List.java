import java.util.*;
public class Array_List{
    public static void main(String[] args){
        ArrayList l1 = new ArrayList(4);
        l1.add("Rahul");
        l1.add("Arjun");
        l1.add("Aman");
        l1.add("Aniket");

        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}