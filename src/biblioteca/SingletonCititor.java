package src.biblioteca;

public class SingletonCititor {


    private static SingletonCititor instance;

    private SingletonCititor()   {
        System.out.println("constructor");
    }

    public static SingletonCititor getInstance() {
        if(instance == null)    {
            instance = new SingletonCititor();
        }
        return instance;
    }



}
