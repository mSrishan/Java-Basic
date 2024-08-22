public class methodOverloading {

    public static void main(String[] args) {
        System.out.println("Method Overloading......");

        Employee emp1 = new Employee(23, "Srishan");
        System.out.println(emp1.name);

        Employee emp2 = new Employee();
    }
}

class Employee {
    int age;
    String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Employee() {
        System.out.println(".......................................... ");
    }
}