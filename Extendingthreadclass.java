//extending thread class
class a extends Thread{
    public void r()
    {
       System.out.println("hello i'm thread");
    }
}
public class Extendingthreadclass{
    public static void main(String[]args){
        a g=new a();
        g.r();
        g.start();
    }
}