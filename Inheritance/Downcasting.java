package Inheritance;


    class Base {
        String name;

        void showMessage()
        {
            System.out.println("Parent method is called");
        }
    }

    // Child class
    class Derived extends Base {
        int age;

        // Performing overriding
        @Override
        void showMessage()
        {
            System.out.println("Child method is called");
        }
    }

    public class Downcasting{

        public static void main(String[] args)
        {
            Base b = new Derived();
            b.name = "Shubham";


            Derived c = (Derived)b;

            c.age = 18;
            c.name="Renu";
            System.out.println(c.name);
            System.out.println(c.age);
            c.showMessage();
        }
    }


