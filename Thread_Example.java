import java.util.Scanner;
class Account
{
    private int bal;
    public Account(int bal)
    {
        this.bal=bal;
    }
    public boolean isSufficientBalance(int w)
    {
        if(bal>w)
         return true;

        return false;
    }

    public void withDraw(int amt)
    {
        bal = bal-amt;
        System.out.println("Withdrawl Money is "+amt);
        System.out.println("Your Current Balance is " +bal);
    }
}

class Customer implements Runnable
{
    private String name;
    private Account ac;
    public Customer(Account ac, String name)
    {
        this.ac=ac; 
        this.name=name;
    }

    public void run()
    {
        Scanner sc = new Scanner(System.in);
       

        synchronized(ac){
             System.out.println(name + ", Enter amount to withdrwal");
        int a = sc.nextInt();
        if(ac.isSufficientBalance(a))
        {
            System.out.println(name);
            ac.withDraw(a);

        }
        else
         System.out.println("Insufficient Balance");
        }
        }
}

public class Thread_Example
{
    public static void main(String [] args)
    {
       
        Account ac = new Account(1000);
        Customer c1 = new Customer(ac,"Raj");
        Customer c2 = new Customer(ac,"Simran");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}