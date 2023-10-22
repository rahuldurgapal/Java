import java.io.*;
public class File_Output_Example
{
    public static void main(String[] args) throws IOException
    {
        int i;
        FileOutputStream fout;
        fout= new FileOutputStream("./Files/rahul.txt",true);
        String s ="Hello my name is Rahul";
        char []ch = s.toCharArray();
        for(i=0;i<s.length();i++)
        {
            fout.write(ch[i]);
        }
        fout.close();
    }
}