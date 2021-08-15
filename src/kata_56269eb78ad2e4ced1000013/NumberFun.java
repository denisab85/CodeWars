package kata_56269eb78ad2e4ced1000013;

public class NumberFun {

    public static long findNextSquare(long sq) {
        long sqrt = (long) Math.sqrt(sq);
        if (sq == sqrt * sqrt) {
            sqrt++;
            return sqrt * sqrt;
        }
        return -1;
    }

}