import java.io.*;
public class throws_example
{
    public static void main(String[] args)
    {
        try{
        throw new IOException();
        // System.out.println("After Exception");
        }catch(IOException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}