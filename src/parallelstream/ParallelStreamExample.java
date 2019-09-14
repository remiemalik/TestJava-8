package parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformannceResult(Supplier<Integer> suplier, int numberOfTimes){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numberOfTimes; i++) {
            suplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public static int sumtSequentialStream(){
        return IntStream.rangeClosed(1, 100000).sum();
    }

    public static int sumtParralelStream(){
        return IntStream.rangeClosed(1, 100000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(checkPerformannceResult(ParallelStreamExample::sumtSequentialStream, 20));
        System.out.println(checkPerformannceResult(ParallelStreamExample::sumtParralelStream, 20));

    }
}
