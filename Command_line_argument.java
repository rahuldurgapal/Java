// Example of command line argument how to pass value throuh command ling in args array variable

public class Command_line_argument
{
    public static void main(String[] args)
    {
        int s=0,i;
        for(i=0;i<args.length;i++)
         s=s+Integer.parseInt(args[i]);

        System.out.println("Sum is "+s);
    }
}