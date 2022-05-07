public class IOThread extends Thread{

    @Override
    public void run() {
        System.out.println(this.getName() + " iniciado.");
        try{
            Thread.sleep(2000); //Sleep por 2 segundos simulando
                                //una tarea de IO que toma un
                                //largo tiempo
        }catch(InterruptedException e){
            System.out.println(this.getName() + " terminado.");
        }
    }
}
