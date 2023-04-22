public class static_example{

    int x=5;    //Instance member variable
    static int y; //static member variable

    public void fun(){
        System.out.println("This is Instance memeber function of the class");
    } 
   
   public static void fun1()
   {
    y=6;
    System.out.println("This is Static member function of the class");
   }
   static class test{                              //Static Class 
        public static String s="India";
   }
    public static void main(String [] args){

        static_example ex = new static_example();
        ex.fun();
        static_example.fun1();                        //Access static function in main function
        System.out.println(static_example.test.s);    //Access static classs with parent class

    }
}