package calculator;

public class Addition {

    // Method for JUnit testing
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("Addition: " + obj.add(10, 20));
        System.out.println("Bindu IK");
    }
}
