class throw_Exception
{
    public static void main(String[] args)
    {
        int bal =  3000;
        int withdrwlamt = 5000;
        try{
        if(bal<withdrwlamt)
         throw new ArithmeticException("Insufficient Balance");
    
        bal = bal-withdrwlamt;
        System.out.println("Transcation Successfully Completed");
        }catch(ArithmeticException e){
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("Program Continue");
    }
}