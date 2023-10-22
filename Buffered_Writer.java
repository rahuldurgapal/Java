import java.io.*;
public class Buffered_Writer
{
    public static void main(String[] args) throws IOException{

        FileWriter fw = new FileWriter("./Files/arjun.txt",true);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("Computer");
        bf.close();
    }
}