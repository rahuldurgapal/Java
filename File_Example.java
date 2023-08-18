import java.io.*;
public class File_Example
{
    public static void main(String[] args) throws IOException
    {
        File f1 = new File("./Files/rahul.txt");
         f1.createNewFile();
        System.out.println("Is Exsists: "+f1.exists());
        System.out.println("Length of the file: "+f1.length());
        System.out.println("Get File Name: "+f1.getName());
        // f1.delete();
        //  System.out.println("Is Exsists: "+f1.exists());
        // System.out.println("Length of the file: "+f1.length());
        // System.out.println("Get File Name: "+f1.getName());
       
    }    
}