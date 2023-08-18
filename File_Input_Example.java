import java.io.*;
public class File_Input_Example
{
    public static void main(String[] args) throws IOException
    {
        int i;
        FileInputStream fin = new FileInputStream("./Files/rahul.txt");

        
        do{
            i=fin.read();
            if(i!=-1)
             System.out.print((char)i);
        }while(i!=-1);

        fin.close();
    }
}