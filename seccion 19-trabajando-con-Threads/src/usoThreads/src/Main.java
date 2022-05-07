public class Main {
    public static void main(String args[]){
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName()+" iniciado.");
        
        Thread t2 = new IOThread();
        t2.start();
        System.out.println(t1.getName() + " iniciado. " + t2.getName() + " .");
        System.out.println(t1.getName() + " terminado.");
             
    }
}
