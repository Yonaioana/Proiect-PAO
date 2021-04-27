package src.biblioteca;

public class SingletonCarte {


        private static SingletonCarte instance;

        private SingletonCarte()   {
            System.out.println("constructor");
        }

        public static SingletonCarte getInstance() {
            if(instance == null)    {
                instance = new SingletonCarte();
            }
            return instance;
        }
    }



