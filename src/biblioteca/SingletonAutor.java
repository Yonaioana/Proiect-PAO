package src.biblioteca;

public class SingletonAutor {

    private static SingletonAutor instance;

    private SingletonAutor()   {
        System.out.println("constructor");
    }

    public static SingletonAutor getInstance() {
        if(instance == null)    {
            instance = new SingletonAutor();
        }
        return instance;
    }


}
