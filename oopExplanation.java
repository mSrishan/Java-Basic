public class oopExplanation {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "Srishan";
        std1.age = 24;
        std1.isHaveGF = true;
        std1.favFood = "Koththu";

        int[] ar = new int[10];
        Student[] arr = new Student[5];
    }
}

class Student {
    String name;
    int age;
    boolean isHaveGF;
    String favFood;
}
