public class methodOverloading {

    public static void main(String[] args) {
        System.out.println("Method Overloading......");

        Employee emp1 = new Employee(23, "Srishan");
        System.out.println(emp1.name);
    }
}

class Employee {
    int age;
    String name;

    public Employee(int x, String y) {
        age = x;
        name = y;
    }
}