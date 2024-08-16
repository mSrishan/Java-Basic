public class parameterizedMethod {
    public static void main(String[] args) {
        getResults("Srishan", 97);
        getSum(40, 50);
    }

    public static void getSum(int x, int y) {
        System.out.println("Sum of the 2 numbers : " + (x + y));
    }

    public static void getResults(String name, int marks) {
        System.out.println(name + "'s result is " + marks + ".");
    }
}
