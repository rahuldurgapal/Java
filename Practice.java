import java.util.*;
public class Practice
{
    public static void main(String[] args)
    {
        int temp;
        System.out.println("Enter the value of temprature");
        Scanner sc = new Scanner(System.in);
        temp=sc.nextInt();
        try
        {
            if(temp<20)
             throw new Exception("Temprature Below Normal");
            else if(temp>20 && temp<40)
             throw new Exception("Normal Temprature");
            else if(temp>40)
             throw new Exception("Temprature is High");
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
       
    }
}