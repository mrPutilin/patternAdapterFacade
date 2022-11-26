package pattern.facade;

public class BinOps {

    public String sum(String a, String b) {
        int d = Integer.parseInt(a, 2);
        int g = Integer.parseInt(b, 2);
        int sum = d + g;
        return Integer.toBinaryString(sum);

    }

    public String mult(String a, String b) {
        int d = Integer.parseInt(a, 2);
        int g = Integer.parseInt(b, 2);
        int sum = d * g;
        return Integer.toBinaryString(sum);

    }
}
