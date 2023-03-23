public class Employee {
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }

    public void show()
    {
        System.out.println("Id=" + ID + "\nName=" + name + "\nAge=" + age);
    }

    public void showNextId()
    {
        System.out.println("Next employee id will be = " + nextId);
    }

    protected void finalize(){
        --nextId;
    }
}
