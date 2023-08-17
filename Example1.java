interface i1
{
		 int x=6;
		 void fun1();
}
class A implements i1
{
       int y=7;
		public void fun1()
		{
				System.out.println("Hello");
		}
}
class Example1
{
	public static void main(String[] args) 
	{
		A obj=new A();
		System.out.println("X="+obj.x);
        System.out.println("Y="+obj.y);
		obj.fun1();
	}
} 