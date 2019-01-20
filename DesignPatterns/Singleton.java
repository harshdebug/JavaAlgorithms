public class Singleton {

    private static Singleton instance;

    // make the default constructor exclusively private
    private Singleton() {};

    public synchronized static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

    // make sure the instance variables are private otherwise user can simple update them
    private int serialNum;

    synchronized int GetNextSerialNum ()
    {
        return ++instance.serialNum;
    }

    public static void main(String[] args)
    {
        Singleton inst = Singleton.getInstance();

        for(int i=0; i<10; i++)
        {
            System.out.print(inst.GetNextSerialNum()+ " ");
        }

        System.out.println();

        for(int i=0; i<10; i++)
        {
            System.out.print(SerialNumberGenerator.FIRST_INSTANCE.getNextSerialNumber()+ " ");
        }
    }

    // alternate approach, simple

    public enum SerialNumberGenerator
    {
        FIRST_INSTANCE, SECOND_INSTANCE;

        private int count;

        public  synchronized  int getNextSerialNumber()
        {
            return ++count;
        }
    }
}
