


class Timer implements Runnable
{

    public void run()
    {
        for(int i=20; i>0; i--)
        {
           System.out.println(Thread.currentThread().getName() + "  " +i);
            try{
                     Thread.currentThread().sleep(2000);          }catch (Exception e){}

        }
            System.out.println(Thread.currentThread().getName() + "\n" + "TIMEOUT");
    }




     public static void main(String args[])
     {
        Timer time=new Timer();
        
        Thread t1 = new Thread(time);
       
        
        t1.setName("Knock");
        

        t1.start();
        
     }
}