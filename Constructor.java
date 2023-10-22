class Box{
    private int l,w,h;
    public Box()  //Default Constructor
    {
        l=10;
        w=8;
        h=4;
    }
    public Box(int L, int W, int H)    // Parametrized Constructor
    {
        l=L;
        w=W;
        h=H;
    }
    public static void main(String[] args){
        Box b1 = new Box();     //defalut constructor calling
        Box b2 = new Box(13,23,15);  // Parameterized Constructor calling
    }
}