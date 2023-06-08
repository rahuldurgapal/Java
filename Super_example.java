class A{
    int z;
    public void f1()
    { }
}

class B{
    int z;
    public void f1()
    {
        super.f1();
    }
    public void f2()
    {
        int z;
        z=2;             //local variable of f2() function
        this.z=3;        //current class or subclass memeber variable
        super.z=4;       //Super class member variable
    }
}

public class Super_example{
    public static void main(String[] args){
        B obj = new B();
        obj.f1();
    }
}