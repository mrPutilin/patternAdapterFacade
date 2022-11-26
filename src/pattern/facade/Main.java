package pattern.facade;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println(binOps.sum("0101", "010"));
        System.out.println(binOps.mult("111", "010010101"));
    }
}
