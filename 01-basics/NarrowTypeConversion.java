package basics;

public class NarrowingExample {

    public static void main(String[] args) {

        double num = 10.5;
        int value = (int) num;   // double → int

        System.out.println(num);
        System.out.println(value);

    }
}
