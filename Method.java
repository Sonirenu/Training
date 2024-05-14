
import java.io.*;

public class Method {

    public static int i = 0;

    Method()
    {
        i++;
    }
    public static int get()
    {
        return i;
    }
    public int m1()
    {
        System.out.println("Inside the method m1 by object of Method class"+i);

        this.m2();

        return 1;
    }
    public void m2()
    {
        System.out.println("In method m2 came from method m1");
    }
}

class Test{

    public static void main(String[] args)
    {

        Method obj = new Method();

        int i = obj.m1();

        System.out.println("Control returned after method m1 :" + i);


        int no_of_objects = Method.get();

        System.out.print( "No of instances created till now : ");


        System.out.println(no_of_objects);
    }

}
