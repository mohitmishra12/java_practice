import java.util.stream.IntStream;

public class PalleralStream {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        IntStream.range(1, 1_000_000).forEach(n->Math.sqrt(n));

        long end = System.currentTimeMillis();
        IntStream.range(1,1_000_000).forEach(n->Math.sqrt(n));
        System.out.println("Sequential Time: " + (end - start));


    }
}
