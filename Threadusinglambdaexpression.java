//creating thread using lambda expression
public class Threadusinglambdaexpression{
    public static void main(String[]args){
        Runnable r=()->System.out.println("i am from java8 version");
        Thread t=new Thread(r);
        t.start();
    }
}