package pattern.adapter;

public class Main {
    public static void main(String[] args) {
        Ints ints = new IntsCalculator(new Calculator());
        System.out.println(ints.sum(2,3));
        System.out.println(ints.pow(2, 3));
        System.out.println(ints.mult(3,3));

    }
}
