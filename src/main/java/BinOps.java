public class BinOps {
    private static final int RADIX = 2;

    public static String sum(String a1, String a2) {
        return Long.toBinaryString(
                Long.sum(
                        Long.parseLong(a1, RADIX),
                        Long.parseLong(a2, RADIX)));
    }

    public static String mult(String a1, String a2) {
        return Long.toBinaryString(
                Math.multiplyExact(
                        Long.parseLong(a1, RADIX),
                        Long.parseLong(a2, RADIX)));
    }
}
