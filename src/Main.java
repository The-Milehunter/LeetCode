public class Main {
    // 1024 512 256 128 64 32 16 8 4 2 0
    //
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));
        StringBuilder binary = new StringBuilder("kavin");

        binary.insert(0,"p ");
        binary.insert(0,"s ");
        System.out.println(binary);
    }
}