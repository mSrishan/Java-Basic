class staticVariables {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "Srishan";
        std1.age = 24;

        Student std2 = new Student();
        System.out.println(std2.age);
    }
}

public class Student {
    String name;
    static int age;
    boolean isHaveGF;
}