public class Example{
    public static void main(String[] args){
        Student s = new Student();
        s.setRollno(32);
        s.setName("Rahul");
        s.setAge(21);
        System.out.println("Roll no is " + s.getRollno());
        System.out.println("Name is " + s.getName());
        System.out.println("Age is " + s.getAge());
    }
}