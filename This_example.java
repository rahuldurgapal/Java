class Box{
    private int l,w,h;
    public void setDimmension(int l,int w, int h){   //instance member function
        this.l=l;
        this.w=w;
        this.h=h;
    }
    // public void showDimmension(){
    //     System.out.println("lengt= "+l);
    //     System.out.println("width= "+w);
    //     System.out.println("Length= "+h)
    // }

    public void sendBox(){
        GiftTaker g = new GiftTaker();
        g.acceptGift(this);
    }
}

public class This_example{
    public static void main(String[] argas){       //static member function
        Box b = new Box();
        b.setDimmension(10,15,18);
    }
}
