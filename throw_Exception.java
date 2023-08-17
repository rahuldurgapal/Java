class throw_Exception
{
    public static void main(String[] args)
    {
        int bal =  3000;
        int withdrwlamt = 5000;
        if(bal<withdrwlamt)
         throw new ArithmeticException("Insufficient Balance");

        bal = bal-withdrwlamt;
        System.out.println("Transcation Successfully Completed");
        System.out.println("Program Continue");
    }
}