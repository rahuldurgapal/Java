import java.io.*;
public class Buffered_Reader
{
    public  static void main(String[] args) throws IOException{

        int ch;
        FileReader fr = new FileReader("./Files/arjun.txt");
        BufferedReader br = new BufferedReader(fr);

        // while((ch=fr.read())!=-1)
        // {
        //     System.out.print((char)ch);
        // }


        // String s1;
        // while((s1=br.readLine())!=null)
        //  System.out.println(s1);
         

        char arr[] = new char[20];
        br.read(arr,3,15);
        System.out.println(arr);
        br.close();
    }
}