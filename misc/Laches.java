package misc;

public class Laches {
    public static void main(String[] args) {
        x((byte)4);
    }

    public static void x(Number n) {
        System.out.println("N");
    }

    public static void x(Byte n) {
        System.out.println("B");
    }
}
