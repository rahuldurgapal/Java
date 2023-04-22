
//Example of class and object in java

class Box{
    
    private int length, breadth, height;
    public void setDimension(int l, int b, int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimension(){
        System.out.println("length=" +length);
        System.out.println("breadth=" +breadth);
        System.out.println("height=" +height);
    }

    
        public static void main(String[] args){

            Box b1=new Box();
            b1.setDimension(10,12,15);
            b1.showDimension();
        }
}   
