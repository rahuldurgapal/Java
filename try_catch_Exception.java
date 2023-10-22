class try_catch_Exception
{
    public static void main(String[] args)
    {
        try{
            System.out.println(3/0);
            System.out.println("In Try");
        }catch(NullPointerException e){
            System.out.println("Exception is: "+ e.getMessage());
        }
        System.out.println("Hello"); 
    }
}