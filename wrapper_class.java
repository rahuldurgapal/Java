//Example of wrapper class 

class wrapper_class{

    public static void main(String[] args)
    {
        Integer i1 = Integer.valueOf("234");
        Double d1 = Double.valueOf("34.56");

        Integer i2 = Integer.valueOf("101101",2);

        int a = Integer.parseInt("5674");
        double d = Double.parseDouble("45.65");

        int x = i1.intValue();
        double y = d1.doubleValue();

        System.out.println(i1);
        System.out.println(d1);
        System.out.println(i2);
        System.out.println(a);
        System.out.println(d);
        System.out.println(x);
        System.out.println(y);
    }
}