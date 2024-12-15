public class Checkingthreadisaliveornot{
    public static void main(String[]args){
        Runnable r=()->System.out.println("i am from java8 version");
        Thread t=new Thread(r);
        t.start();
        System.out.println(t.isAlive());
    }
}