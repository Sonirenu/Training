public class MethodString {
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public  void setNumber(int number)
    {
        this.number = number;
    }

    public void setName(String name) { this.name = name; }

    public void printDetails()
    {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        MethodString ms = new MethodString();
        ms.setNumber(123);
        ms.setName("Hello There ");
        ms.printDetails();

    }
}



