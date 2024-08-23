public class instanceVariables {
    public static void main(String[] args) {
        // local variables
        int value = 89;
        System.out.println(value);

        // instance variables
        child chd1 = new child();
        System.out.println(chd1.age);

        // static variables
        child chd2 = new child();
        System.out.println(chd2.grade);

    }
}

class child {
    int id;
    String name;
    int age;
    static int grade;
}
