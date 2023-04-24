import pack2.Student;
public class Import_Example{

    public static void main(String[] args)
    {
        Student s = new Student();
        s.setRollno(32);
        s.setName("Rahul");
        System.out.println("Roll no is " +s.getrollno());
        System.out.println("Name is " +s.getName());
    }
}